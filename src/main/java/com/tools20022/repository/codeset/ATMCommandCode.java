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
import com.tools20022.repository.codeset.ATMCommandCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of command performed by an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#ATMBalance
 * ATMCommandCode.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#ATMStatusUpdate
 * ATMCommandCode.ATMStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#ConfigurationUpdate
 * ATMCommandCode.ConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#CountersInquiry
 * ATMCommandCode.CountersInquiry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#Disconnect
 * ATMCommandCode.Disconnect}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#SendMessage
 * ATMCommandCode.SendMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#KeyActivation
 * ATMCommandCode.KeyActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#KeyDeactivation
 * ATMCommandCode.KeyDeactivation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#KeyDownload
 * ATMCommandCode.KeyDownload}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#KeyRemove
 * ATMCommandCode.KeyRemove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#SecurityDeviceConfigurationUpdate
 * ATMCommandCode.SecurityDeviceConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#SecurityDeviceSchemeUpdate
 * ATMCommandCode.SecurityDeviceSchemeUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#SecurityDeviceStatusUpdate
 * ATMCommandCode.SecurityDeviceStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#CountersReport
 * ATMCommandCode.CountersReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#HLAKeyReplace
 * ATMCommandCode.HLAKeyReplace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode#HLAKeyRemove
 * ATMCommandCode.HLAKeyRemove}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommandCode#KeyReplace
 * ATMCommandCode.KeyReplace}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.codeset.rATMCommand6Code
 * rATMCommand6Code}</li>
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
 * "ATMCommandCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of command performed by an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCommandCode extends MMCode {

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
	public static final ATMCommandCode ATMBalance = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Provide the ATM counters, resetting those that are applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode ATMStatusUpdate = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMStatusUpdate";
			definition = "Status of the ATM required by the ATM manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode ConfigurationUpdate = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationUpdate";
			definition = "Update the ATM configuration parameters.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode CountersInquiry = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			definition = "Request the value of the ATM counters.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode Disconnect = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disconnect";
			definition = "Perform a disconnection followed by a reconnection.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode SendMessage = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendMessage";
			definition = "Send a specific message to initiate a process.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode KeyActivation = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyActivation";
			definition = "Activate cryptographic keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode KeyDeactivation = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDeactivation";
			definition = "Deactivate cryptographic keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode KeyDownload = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			definition = "Start a cryptographic key download.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode KeyRemove = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyRemove";
			definition = "Remove cryptographic keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode SecurityDeviceConfigurationUpdate = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceConfigurationUpdate";
			definition = "Update the configuration of the hardware security module on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode SecurityDeviceSchemeUpdate = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceSchemeUpdate";
			definition = "Update the security scheme of the hardware security module on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode SecurityDeviceStatusUpdate = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceStatusUpdate";
			definition = "Update the status of the hardware security module on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
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
	public static final ATMCommandCode CountersReport = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			definition = "Provide the value of the ATM counters, no reinitialisation of the counters.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
			codeName = "RPTC";
		}
	};
	/**
	 * Replace an existing key using a Higher Level Authority (HLA) key. In the
	 * TR34 scheme this would be used to implement a HLA Rebind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HKCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HLAKeyReplace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replace an existing key using a Higher Level Authority (HLA) key. In the TR34 scheme this would be used to implement a HLA Rebind operation."
	 * </li>
	 * </ul>
	 */
	public static final ATMCommandCode HLAKeyReplace = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HLAKeyReplace";
			definition = "Replace an existing key using a Higher Level Authority (HLA) key. In the TR34 scheme this would be used to implement a HLA Rebind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
			codeName = "HKCG";
		}
	};
	/**
	 * Remove a cryptographic key using a Higher Level Authority key (HLA). In
	 * the TR34 scheme this would be used to implement a HLA Unbind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HKRV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HLAKeyRemove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remove a cryptographic key using a Higher Level Authority key (HLA). In the TR34 scheme this would be used to implement a HLA Unbind operation."
	 * </li>
	 * </ul>
	 */
	public static final ATMCommandCode HLAKeyRemove = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HLAKeyRemove";
			definition = "Remove a cryptographic key using a Higher Level Authority key (HLA). In the TR34 scheme this would be used to implement a HLA Unbind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
			codeName = "HKRV";
		}
	};
	/**
	 * Replaces an existing cryptographic key. In a TR34 scheme this would be
	 * used to implement a Rebind operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode
	 * ATMCommandCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyReplace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Replaces an existing cryptographic key. In a TR34 scheme this would be used to implement a Rebind operation."
	 * </li>
	 * </ul>
	 */
	public static final ATMCommandCode KeyReplace = new ATMCommandCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyReplace";
			definition = "Replaces an existing cryptographic key. In a TR34 scheme this would be used to implement a Rebind operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandCode.mmObject();
			codeName = "KCHG";
		}
	};
	final static private LinkedHashMap<String, ATMCommandCode> codesByName = new LinkedHashMap<>();

	protected ATMCommandCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandCode";
				definition = "Type of command performed by an ATM.";
				derivation_lazy = () -> Arrays.asList(ATMCommand2Code.mmObject(), ATMCommand1Code.mmObject(), ATMCommand3Code.mmObject(), ATMCommand4Code.mmObject(), ATMCommand5Code.mmObject(), rATMCommand6Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCommandCode.ATMBalance, com.tools20022.repository.codeset.ATMCommandCode.ATMStatusUpdate,
						com.tools20022.repository.codeset.ATMCommandCode.ConfigurationUpdate, com.tools20022.repository.codeset.ATMCommandCode.CountersInquiry, com.tools20022.repository.codeset.ATMCommandCode.Disconnect,
						com.tools20022.repository.codeset.ATMCommandCode.SendMessage, com.tools20022.repository.codeset.ATMCommandCode.KeyActivation, com.tools20022.repository.codeset.ATMCommandCode.KeyDeactivation,
						com.tools20022.repository.codeset.ATMCommandCode.KeyDownload, com.tools20022.repository.codeset.ATMCommandCode.KeyRemove, com.tools20022.repository.codeset.ATMCommandCode.SecurityDeviceConfigurationUpdate,
						com.tools20022.repository.codeset.ATMCommandCode.SecurityDeviceSchemeUpdate, com.tools20022.repository.codeset.ATMCommandCode.SecurityDeviceStatusUpdate,
						com.tools20022.repository.codeset.ATMCommandCode.CountersReport, com.tools20022.repository.codeset.ATMCommandCode.HLAKeyReplace, com.tools20022.repository.codeset.ATMCommandCode.HLAKeyRemove,
						com.tools20022.repository.codeset.ATMCommandCode.KeyReplace);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMBalance.getCodeName().get(), ATMBalance);
		codesByName.put(ATMStatusUpdate.getCodeName().get(), ATMStatusUpdate);
		codesByName.put(ConfigurationUpdate.getCodeName().get(), ConfigurationUpdate);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(Disconnect.getCodeName().get(), Disconnect);
		codesByName.put(SendMessage.getCodeName().get(), SendMessage);
		codesByName.put(KeyActivation.getCodeName().get(), KeyActivation);
		codesByName.put(KeyDeactivation.getCodeName().get(), KeyDeactivation);
		codesByName.put(KeyDownload.getCodeName().get(), KeyDownload);
		codesByName.put(KeyRemove.getCodeName().get(), KeyRemove);
		codesByName.put(SecurityDeviceConfigurationUpdate.getCodeName().get(), SecurityDeviceConfigurationUpdate);
		codesByName.put(SecurityDeviceSchemeUpdate.getCodeName().get(), SecurityDeviceSchemeUpdate);
		codesByName.put(SecurityDeviceStatusUpdate.getCodeName().get(), SecurityDeviceStatusUpdate);
		codesByName.put(CountersReport.getCodeName().get(), CountersReport);
		codesByName.put(HLAKeyReplace.getCodeName().get(), HLAKeyReplace);
		codesByName.put(HLAKeyRemove.getCodeName().get(), HLAKeyRemove);
		codesByName.put(KeyReplace.getCodeName().get(), KeyReplace);
	}

	public static ATMCommandCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCommandCode[] values() {
		ATMCommandCode[] values = new ATMCommandCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCommandCode> {
		@Override
		public ATMCommandCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCommandCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}