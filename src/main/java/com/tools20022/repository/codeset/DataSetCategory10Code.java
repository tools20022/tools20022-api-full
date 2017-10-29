/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.DataSetCategoryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Maintenance services provided by a terminal manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#AcquirerParameters
 * DataSetCategory10Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#ApplicationParameters
 * DataSetCategory10Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#MasterTerminalManager
 * DataSetCategory10Code.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#MerchantParameters
 * DataSetCategory10Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#Monitoring
 * DataSetCategory10Code.Monitoring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#SecurityParameters
 * DataSetCategory10Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#SoftwareModule
 * DataSetCategory10Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#TerminalParameters
 * DataSetCategory10Code.TerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#CertificateParameters
 * DataSetCategory10Code.CertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#TMSProtocolParameters
 * DataSetCategory10Code.TMSProtocolParameters}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetCategory10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance services provided by a terminal manager."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
 * DataSetCategory5Code}</li>
 * </ul>
 */
public class DataSetCategory10Code extends DataSetCategoryCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#AcquirerParameters
	 * DataSetCategory5Code.AcquirerParameters}</li>
	 * </ul>
	 */
	public static final MMCode AcquirerParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.AcquirerParameters;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#ApplicationParameters
	 * DataSetCategory5Code.ApplicationParameters}</li>
	 * </ul>
	 */
	public static final MMCode ApplicationParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.ApplicationParameters;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#MasterTerminalManager
	 * DataSetCategory5Code.MasterTerminalManager}</li>
	 * </ul>
	 */
	public static final MMCode MasterTerminalManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.MasterTerminalManager;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#MerchantParameters
	 * DataSetCategory5Code.MerchantParameters}</li>
	 * </ul>
	 */
	public static final MMCode MerchantParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.MerchantParameters;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#Monitoring
	 * DataSetCategory5Code.Monitoring}</li>
	 * </ul>
	 */
	public static final MMCode Monitoring = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.Monitoring;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#SecurityParameters
	 * DataSetCategory5Code.SecurityParameters}</li>
	 * </ul>
	 */
	public static final MMCode SecurityParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.SecurityParameters;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#SoftwareModule
	 * DataSetCategory5Code.SoftwareModule}</li>
	 * </ul>
	 */
	public static final MMCode SoftwareModule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.SoftwareModule;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#TerminalParameters
	 * DataSetCategory5Code.TerminalParameters}</li>
	 * </ul>
	 */
	public static final MMCode TerminalParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.TerminalParameters;
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * </ul>
	 */
	public static final MMCode CertificateParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
	 * DataSetCategory10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * </ul>
	 */
	public static final MMCode TMSProtocolParameters = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			owner_lazy = () -> DataSetCategory10Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory10Code";
				definition = "Maintenance services provided by a terminal manager.";
				previousVersion_lazy = () -> DataSetCategory5Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory10Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory10Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory10Code.MasterTerminalManager, com.tools20022.repository.codeset.DataSetCategory10Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory10Code.Monitoring, com.tools20022.repository.codeset.DataSetCategory10Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory10Code.SoftwareModule,
						com.tools20022.repository.codeset.DataSetCategory10Code.TerminalParameters, com.tools20022.repository.codeset.DataSetCategory10Code.CertificateParameters,
						com.tools20022.repository.codeset.DataSetCategory10Code.TMSProtocolParameters);
				trace_lazy = () -> DataSetCategoryCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}