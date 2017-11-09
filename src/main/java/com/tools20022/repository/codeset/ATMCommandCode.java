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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of command performed by an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand2Code
 * ATMCommand2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand1Code
 * ATMCommand1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand3Code
 * ATMCommand3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand4Code
 * ATMCommand4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand5Code
 * ATMCommand5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmATMBalance
 * ATMCommandCode.mmATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmATMStatusUpdate
 * ATMCommandCode.mmATMStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmConfigurationUpdate
 * ATMCommandCode.mmConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmCountersInquiry
 * ATMCommandCode.mmCountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmDisconnect
 * ATMCommandCode.mmDisconnect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmSendMessage
 * ATMCommandCode.mmSendMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmKeyActivation
 * ATMCommandCode.mmKeyActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmKeyDeactivation
 * ATMCommandCode.mmKeyDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmKeyDownload
 * ATMCommandCode.mmKeyDownload}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmKeyRemove
 * ATMCommandCode.mmKeyRemove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmSecurityDeviceConfigurationUpdate
 * ATMCommandCode.mmSecurityDeviceConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmSecurityDeviceSchemeUpdate
 * ATMCommandCode.mmSecurityDeviceSchemeUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmSecurityDeviceStatusUpdate
 * ATMCommandCode.mmSecurityDeviceStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#mmCountersReport
 * ATMCommandCode.mmCountersReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCommandCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of command performed by an ATM."</li>
 * </ul>
 */
public class ATMCommandCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provide the ATM counters, resetting those that are applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide the ATM counters, resetting those that are applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmATMBalance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Provide the ATM counters, resetting those that are applicable.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "ABAL";
		}
	};
	/**
	 * Status of the ATM required by the ATM manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMStatusUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the ATM required by the ATM manager."</li>
	 * </ul>
	 */
	public static final MMCode mmATMStatusUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMStatusUpdate";
			definition = "Status of the ATM required by the ATM manager.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "ASTS";
		}
	};
	/**
	 * Update the ATM configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfigurationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Update the ATM configuration parameters."</li>
	 * </ul>
	 */
	public static final MMCode mmConfigurationUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationUpdate";
			definition = "Update the ATM configuration parameters.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "CFGT";
		}
	};
	/**
	 * Request the value of the ATM counters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request the value of the ATM counters."</li>
	 * </ul>
	 */
	public static final MMCode mmCountersInquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			definition = "Request the value of the ATM counters.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "CCNT";
		}
	};
	/**
	 * Perform a disconnection followed by a reconnection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disconnect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Perform a disconnection followed by a reconnection."</li>
	 * </ul>
	 */
	public static final MMCode mmDisconnect = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disconnect";
			definition = "Perform a disconnection followed by a reconnection.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Send a specific message to initiate a process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Send a specific message to initiate a process."</li>
	 * </ul>
	 */
	public static final MMCode mmSendMessage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendMessage";
			definition = "Send a specific message to initiate a process.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "SNDM";
		}
	};
	/**
	 * Activate cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Activate cryptographic keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyActivation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyActivation";
			definition = "Activate cryptographic keys.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "KACT";
		}
	};
	/**
	 * Deactivate cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDeactivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deactivate cryptographic keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyDeactivation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDeactivation";
			definition = "Deactivate cryptographic keys.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "KDAC";
		}
	};
	/**
	 * Start a cryptographic key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDWL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start a cryptographic key download."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyDownload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			definition = "Start a cryptographic key download.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "KDWL";
		}
	};
	/**
	 * Remove cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KRMV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyRemove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remove cryptographic keys."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyRemove = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyRemove";
			definition = "Remove cryptographic keys.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "KRMV";
		}
	};
	/**
	 * Update the configuration of the hardware security module on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceConfigurationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Update the configuration of the hardware security module on the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityDeviceConfigurationUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceConfigurationUpdate";
			definition = "Update the configuration of the hardware security module on the ATM.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "SCFU";
		}
	};
	/**
	 * Update the security scheme of the hardware security module on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceSchemeUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Update the security scheme of the hardware security module on the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityDeviceSchemeUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceSchemeUpdate";
			definition = "Update the security scheme of the hardware security module on the ATM.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "SSCU";
		}
	};
	/**
	 * Update the status of the hardware security module on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceStatusUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Update the status of the hardware security module on the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityDeviceStatusUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceStatusUpdate";
			definition = "Update the status of the hardware security module on the ATM.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "SSTU";
		}
	};
	/**
	 * Provide the value of the ATM counters, no reinitialisation of the
	 * counters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide the value of the ATM counters, no reinitialisation of the counters."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCountersReport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			definition = "Provide the value of the ATM counters, no reinitialisation of the counters.";
			owner_lazy = () -> ATMCommandCode.mmObject();
			codeName = "RPTC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandCode";
				definition = "Type of command performed by an ATM.";
				code_lazy = () -> Arrays.asList(ATMCommandCode.mmATMBalance, ATMCommandCode.mmATMStatusUpdate, ATMCommandCode.mmConfigurationUpdate, ATMCommandCode.mmCountersInquiry, ATMCommandCode.mmDisconnect,
						ATMCommandCode.mmSendMessage, ATMCommandCode.mmKeyActivation, ATMCommandCode.mmKeyDeactivation, ATMCommandCode.mmKeyDownload, ATMCommandCode.mmKeyRemove, ATMCommandCode.mmSecurityDeviceConfigurationUpdate,
						ATMCommandCode.mmSecurityDeviceSchemeUpdate, ATMCommandCode.mmSecurityDeviceStatusUpdate, ATMCommandCode.mmCountersReport);
				derivation_lazy = () -> Arrays.asList(ATMCommand2Code.mmObject(), ATMCommand1Code.mmObject(), ATMCommand3Code.mmObject(), ATMCommand4Code.mmObject(), ATMCommand5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}