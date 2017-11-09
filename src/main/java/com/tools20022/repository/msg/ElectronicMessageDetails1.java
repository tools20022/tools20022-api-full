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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Summary of electronic message details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1#mmElectronicSystemInformationMessageIdentifier
 * ElectronicMessageDetails1.mmElectronicSystemInformationMessageIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1#mmElectronicSystemInformationMessagePacketIdentifier
 * ElectronicMessageDetails1.
 * mmElectronicSystemInformationMessagePacketIdentifier}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectronicMessageDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Summary of electronic message details."</li>
 * </ul>
 */
public class ElectronicMessageDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text electronicSystemInformationMessageIdentifier;
	/**
	 * Information about separate electronic system information message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1
	 * ElectronicMessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSysInfMsgIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSystemInformationMessageIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about separate electronic system information message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSystemInformationMessageIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ElectronicMessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSysInfMsgIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSystemInformationMessageIdentifier";
			definition = "Information about separate electronic system information message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text electronicSystemInformationMessagePacketIdentifier;
	/**
	 * Information about packet of electronic system messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectronicMessageDetails1
	 * ElectronicMessageDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSysInfMsgPacketIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSystemInformationMessagePacketIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about packet of electronic system messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSystemInformationMessagePacketIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ElectronicMessageDetails1.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSysInfMsgPacketIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSystemInformationMessagePacketIdentifier";
			definition = "Information about packet of electronic system messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ElectronicMessageDetails1.mmElectronicSystemInformationMessageIdentifier, ElectronicMessageDetails1.mmElectronicSystemInformationMessagePacketIdentifier);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ElectronicMessageDetails1";
				definition = "Summary of electronic message details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getElectronicSystemInformationMessageIdentifier() {
		return electronicSystemInformationMessageIdentifier;
	}

	public void setElectronicSystemInformationMessageIdentifier(Max35Text electronicSystemInformationMessageIdentifier) {
		this.electronicSystemInformationMessageIdentifier = electronicSystemInformationMessageIdentifier;
	}

	public Max35Text getElectronicSystemInformationMessagePacketIdentifier() {
		return electronicSystemInformationMessagePacketIdentifier;
	}

	public void setElectronicSystemInformationMessagePacketIdentifier(Max35Text electronicSystemInformationMessagePacketIdentifier) {
		this.electronicSystemInformationMessagePacketIdentifier = electronicSystemInformationMessagePacketIdentifier;
	}
}