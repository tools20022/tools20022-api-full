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
import com.tools20022.repository.codeset.ATMCommand2Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ATMBalance
 * ATMCommand2Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ATMStatusUpdate
 * ATMCommand2Code.ATMStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#ConfigurationUpdate
 * ATMCommand2Code.ConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#CountersInquiry
 * ATMCommand2Code.CountersInquiry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand2Code#Disconnect
 * ATMCommand2Code.Disconnect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyActivation
 * ATMCommand2Code.KeyActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyDeactivation
 * ATMCommand2Code.KeyDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyDownload
 * ATMCommand2Code.KeyDownload}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand2Code#KeyRemove
 * ATMCommand2Code.KeyRemove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceConfigurationUpdate
 * ATMCommand2Code.SecurityDeviceConfigurationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceSchemeUpdate
 * ATMCommand2Code.SecurityDeviceSchemeUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SecurityDeviceStatusUpdate
 * ATMCommand2Code.SecurityDeviceStatusUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code#SendMessage
 * ATMCommand2Code.SendMessage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCommandCode ATMCommandCode}</li>
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
 * "ATMCommand2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of command performed by the ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCommand6Code
 * ATMCommand6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCommand2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ATMBalance
	 * ATMCommand6Code.ATMBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code ATMBalance = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.ATMBalance);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.ATMBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMStatusUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ATMStatusUpdate
	 * ATMCommand6Code.ATMStatusUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code ATMStatusUpdate = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMStatusUpdate";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.ATMStatusUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.ATMStatusUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfigurationUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#ConfigurationUpdate
	 * ATMCommand6Code.ConfigurationUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code ConfigurationUpdate = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationUpdate";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.ConfigurationUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.ConfigurationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#CountersInquiry
	 * ATMCommand6Code.CountersInquiry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code CountersInquiry = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.CountersInquiry);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disconnect"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#Disconnect
	 * ATMCommand6Code.Disconnect}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code Disconnect = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disconnect";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.Disconnect);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.Disconnect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyActivation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyActivation
	 * ATMCommand6Code.KeyActivation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code KeyActivation = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyActivation";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.KeyActivation);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.KeyActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDeactivation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyDeactivation
	 * ATMCommand6Code.KeyDeactivation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code KeyDeactivation = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDeactivation";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.KeyDeactivation);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.KeyDeactivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyDownload"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyDownload
	 * ATMCommand6Code.KeyDownload}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code KeyDownload = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyDownload";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.KeyDownload);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.KeyDownload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyRemove"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#KeyRemove
	 * ATMCommand6Code.KeyRemove}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code KeyRemove = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyRemove";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.KeyRemove);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.KeyRemove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceConfigurationUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceConfigurationUpdate
	 * ATMCommand6Code.SecurityDeviceConfigurationUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code SecurityDeviceConfigurationUpdate = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceConfigurationUpdate";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.SecurityDeviceConfigurationUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceConfigurationUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceSchemeUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceSchemeUpdate
	 * ATMCommand6Code.SecurityDeviceSchemeUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code SecurityDeviceSchemeUpdate = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceSchemeUpdate";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.SecurityDeviceSchemeUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceSchemeUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDeviceStatusUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SecurityDeviceStatusUpdate
	 * ATMCommand6Code.SecurityDeviceStatusUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code SecurityDeviceStatusUpdate = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDeviceStatusUpdate";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.SecurityDeviceStatusUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.SecurityDeviceStatusUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand2Code
	 * ATMCommand2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendMessage"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code#SendMessage
	 * ATMCommand6Code.SendMessage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMCommand2Code SendMessage = new ATMCommand2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendMessage";
			nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.SendMessage);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommand2Code.mmObject();
			codeName = ATMCommandCode.SendMessage.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCommand2Code> codesByName = new LinkedHashMap<>();

	protected ATMCommand2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommand2Code";
				definition = "Type of command performed by the ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommand6Code.mmObject());
				trace_lazy = () -> ATMCommandCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCommand2Code.ATMBalance, com.tools20022.repository.codeset.ATMCommand2Code.ATMStatusUpdate,
						com.tools20022.repository.codeset.ATMCommand2Code.ConfigurationUpdate, com.tools20022.repository.codeset.ATMCommand2Code.CountersInquiry, com.tools20022.repository.codeset.ATMCommand2Code.Disconnect,
						com.tools20022.repository.codeset.ATMCommand2Code.KeyActivation, com.tools20022.repository.codeset.ATMCommand2Code.KeyDeactivation, com.tools20022.repository.codeset.ATMCommand2Code.KeyDownload,
						com.tools20022.repository.codeset.ATMCommand2Code.KeyRemove, com.tools20022.repository.codeset.ATMCommand2Code.SecurityDeviceConfigurationUpdate,
						com.tools20022.repository.codeset.ATMCommand2Code.SecurityDeviceSchemeUpdate, com.tools20022.repository.codeset.ATMCommand2Code.SecurityDeviceStatusUpdate,
						com.tools20022.repository.codeset.ATMCommand2Code.SendMessage);
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
	}

	public static ATMCommand2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCommand2Code[] values() {
		ATMCommand2Code[] values = new ATMCommand2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCommand2Code> {
		@Override
		public ATMCommand2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCommand2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}