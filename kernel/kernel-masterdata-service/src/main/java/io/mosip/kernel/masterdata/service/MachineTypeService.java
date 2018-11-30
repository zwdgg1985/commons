package io.mosip.kernel.masterdata.service;

import io.mosip.kernel.masterdata.dto.MachineTypeRequestDto;
import io.mosip.kernel.masterdata.entity.id.CodeAndLanguageCodeID;

/**
 * This interface has abstract methods to save a Machine Type Details to the
 * database table
 * 
 * @author Megha Tanga
 * @since 1.0.0
 *
 */
public interface MachineTypeService {
	
	/**
	 * Abstract method to save Machine Type Details to the Database
	 * 
	 * @param machineType
	 * 
	 * @return {@link CodeAndLanguageCodeID}
	 */
   public CodeAndLanguageCodeID createMachineType(MachineTypeRequestDto machineType);

}
