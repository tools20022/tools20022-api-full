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
import com.tools20022.repository.codeset.ATMCommand6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of command performed by the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ATMBalance
 * ATMCommand6Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ATMStatusUpdate
 * ATMCommand6Code.ATMStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ConfigurationUpdate
 * ATMCommand6Code.ConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#CountersInquiry
 * ATMCommand6Code.CountersInquiry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand6Code#Disconnect
 * ATMCommand6Code.Disconnect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyActivation
 * ATMCommand6Code.KeyActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyDeactivation
 * ATMCommand6Code.KeyDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyDownload
 * ATMCommand6Code.KeyDownload}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyRemove
 * ATMCommand6Code.KeyRemove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceConfigurationUpdate
 * ATMCommand6Code.SecurityDeviceConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceSchemeUpdate
 * ATMCommand6Code.SecurityDeviceSchemeUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceStatusUpdate
 * ATMCommand6Code.SecurityDeviceStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SendMessage
 * ATMCommand6Code.SendMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#HLAKeyReplace
 * ATMCommand6Code.HLAKeyReplace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#HLAKeyRemove
 * ATMCommand6Code.HLAKeyRemove}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyReplace
 * ATMCommand6Code.KeyReplace}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode ATMCommandCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCommand6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of command performed by the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
 * ATMCommand2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCommand6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ATMBalance
	 * ATMCommand2Code.ATMBalance}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code ATMBalance = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			previousVersion_lazy = () -> ATMCommand2Code.ATMBalance;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.ATMBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMStatusUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ATMStatusUpdate
	 * ATMCommand2Code.ATMStatusUpdate}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code ATMStatusUpdate = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMStatusUpdate";
			previousVersion_lazy = () -> ATMCommand2Code.ATMStatusUpdate;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.ATMStatusUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfigurationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ConfigurationUpdate
	 * ATMCommand2Code.ConfigurationUpdate}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code ConfigurationUpdate = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationUpdate";
			previousVersion_lazy = () -> ATMCommand2Code.ConfigurationUpdate;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.ConfigurationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#CountersInquiry
	 * ATMCommand2Code.CountersInquiry}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code CountersInquiry = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			previousVersion_lazy = () -> ATMCommand2Code.CountersInquiry;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disconnect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#Disconnect
	 * ATMCommand2Code.Disconnect}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code Disconnect = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disconnect";
			previousVersion_lazy = () -> ATMCommand2Code.Disconnect;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.Disconnect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyActivation
	 * ATMCommand2Code.KeyActivation}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code KeyActivation = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyActivation";
			previousVersion_lazy = () -> ATMCommand2Code.KeyActivation;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.KeyActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDeactivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyDeactivation
	 * ATMCommand2Code.KeyDeactivation}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code KeyDeactivation = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDeactivation";
			previousVersion_lazy = () -> ATMCommand2Code.KeyDeactivation;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.KeyDeactivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyDownload
	 * ATMCommand2Code.KeyDownload}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code KeyDownload = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			previousVersion_lazy = () -> ATMCommand2Code.KeyDownload;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.KeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyRemove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyRemove
	 * ATMCommand2Code.KeyRemove}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code KeyRemove = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyRemove";
			previousVersion_lazy = () -> ATMCommand2Code.KeyRemove;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.KeyRemove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceConfigurationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceConfigurationUpdate
	 * ATMCommand2Code.SecurityDeviceConfigurationUpdate}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code SecurityDeviceConfigurationUpdate = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceConfigurationUpdate";
			previousVersion_lazy = () -> ATMCommand2Code.SecurityDeviceConfigurationUpdate;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceConfigurationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceSchemeUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceSchemeUpdate
	 * ATMCommand2Code.SecurityDeviceSchemeUpdate}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code SecurityDeviceSchemeUpdate = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceSchemeUpdate";
			previousVersion_lazy = () -> ATMCommand2Code.SecurityDeviceSchemeUpdate;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceSchemeUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceStatusUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceStatusUpdate
	 * ATMCommand2Code.SecurityDeviceStatusUpdate}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code SecurityDeviceStatusUpdate = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceStatusUpdate";
			previousVersion_lazy = () -> ATMCommand2Code.SecurityDeviceStatusUpdate;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceStatusUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SendMessage
	 * ATMCommand2Code.SendMessage}</li>
	 * </ul>
	 */
	public static final ATMCommand6Code SendMessage = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendMessage";
			previousVersion_lazy = () -> ATMCommand2Code.SendMessage;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.SendMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HLAKeyReplace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCommand6Code HLAKeyReplace = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HLAKeyReplace";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.HLAKeyReplace.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HLAKeyRemove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCommand6Code HLAKeyRemove = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HLAKeyRemove";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.HLAKeyRemove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyReplace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMCommand6Code KeyReplace = new ATMCommand6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyReplace";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand6Code.mmObject();
			codeName = ATMCommandCode.KeyReplace.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCommand6Code> codesByName = new LinkedHashMap<>();

	protected ATMCommand6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand6Code";
				definition = "Type of command performed by the ATM.";
				previousVersion_lazy = () -> ATMCommand2Code.mmObject();
				trace_lazy = () -> ATMCommandCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCommand6Code.ATMBalance, com.tools20022.repository.codeset.ATMCommand6Code.ATMStatusUpdate,
						com.tools20022.repository.codeset.ATMCommand6Code.ConfigurationUpdate, com.tools20022.repository.codeset.ATMCommand6Code.CountersInquiry, com.tools20022.repository.codeset.ATMCommand6Code.Disconnect,
						com.tools20022.repository.codeset.ATMCommand6Code.KeyActivation, com.tools20022.repository.codeset.ATMCommand6Code.KeyDeactivation, com.tools20022.repository.codeset.ATMCommand6Code.KeyDownload,
						com.tools20022.repository.codeset.ATMCommand6Code.KeyRemove, com.tools20022.repository.codeset.ATMCommand6Code.SecurityDeviceConfigurationUpdate,
						com.tools20022.repository.codeset.ATMCommand6Code.SecurityDeviceSchemeUpdate, com.tools20022.repository.codeset.ATMCommand6Code.SecurityDeviceStatusUpdate,
						com.tools20022.repository.codeset.ATMCommand6Code.SendMessage, com.tools20022.repository.codeset.ATMCommand6Code.HLAKeyReplace, com.tools20022.repository.codeset.ATMCommand6Code.HLAKeyRemove,
						com.tools20022.repository.codeset.ATMCommand6Code.KeyReplace);
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
		codesByName.put(KeyActivation.getCodeName().get(), KeyActivation);
		codesByName.put(KeyDeactivation.getCodeName().get(), KeyDeactivation);
		codesByName.put(KeyDownload.getCodeName().get(), KeyDownload);
		codesByName.put(KeyRemove.getCodeName().get(), KeyRemove);
		codesByName.put(SecurityDeviceConfigurationUpdate.getCodeName().get(), SecurityDeviceConfigurationUpdate);
		codesByName.put(SecurityDeviceSchemeUpdate.getCodeName().get(), SecurityDeviceSchemeUpdate);
		codesByName.put(SecurityDeviceStatusUpdate.getCodeName().get(), SecurityDeviceStatusUpdate);
		codesByName.put(SendMessage.getCodeName().get(), SendMessage);
		codesByName.put(HLAKeyReplace.getCodeName().get(), HLAKeyReplace);
		codesByName.put(HLAKeyRemove.getCodeName().get(), HLAKeyRemove);
		codesByName.put(KeyReplace.getCodeName().get(), KeyReplace);
	}

	public static ATMCommand6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCommand6Code[] values() {
		ATMCommand6Code[] values = new ATMCommand6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCommand6Code> {
		@Override
		public ATMCommand6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCommand6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}