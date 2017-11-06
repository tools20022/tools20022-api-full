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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.PINFormat1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Authentication;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Encrypted personal identification number (PIN) and related information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1#mmEncryptedPINBlock
 * OnLinePIN1.mmEncryptedPINBlock}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1#mmPINFormat
 * OnLinePIN1.mmPINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN1#mmAdditionalInput
 * OnLinePIN1.mmAdditionalInput}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "OnLinePIN1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Encrypted personal identification number (PIN) and related information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN2 OnLinePIN2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class OnLinePIN1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentInformationType2 encryptedPINBlock;
	/**
	 * Encrypted PIN (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType2
	 * ContentInformationType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN1
	 * OnLinePIN1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdPINBlck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedPINBlock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted PIN (Personal Identification Number)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryptedPINBlock = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OnLinePIN1.mmObject();
			isDerived = false;
			xmlTag = "NcrptdPINBlck";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedPINBlock";
			definition = "Encrypted PIN (Personal Identification Number).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType2.mmObject();
		}
	};
	protected PINFormat1Code pINFormat;
	/**
	 * PIN format before encryption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat1Code
	 * PINFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmPINFormat
	 * Authentication.mmPINFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN1
	 * OnLinePIN1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PINFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PIN format before encryption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINFormat = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Authentication.mmPINFormat;
			componentContext_lazy = () -> OnLinePIN1.mmObject();
			isDerived = false;
			xmlTag = "PINFrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINFormat";
			definition = "PIN format before encryption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormat1Code.mmObject();
		}
	};
	protected Max35Text additionalInput;
	/**
	 * Additional information required to verify the PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN1
	 * OnLinePIN1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInput"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information required to verify the PIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInput = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OnLinePIN1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInput";
			definition = "Additional information required to verify the PIN.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OnLinePIN1.mmEncryptedPINBlock, com.tools20022.repository.msg.OnLinePIN1.mmPINFormat, com.tools20022.repository.msg.OnLinePIN1.mmAdditionalInput);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OnLinePIN1";
				definition = "Encrypted personal identification number (PIN) and related information.";
				nextVersions_lazy = () -> Arrays.asList(OnLinePIN2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ContentInformationType2 getEncryptedPINBlock() {
		return encryptedPINBlock;
	}

	public void setEncryptedPINBlock(com.tools20022.repository.msg.ContentInformationType2 encryptedPINBlock) {
		this.encryptedPINBlock = encryptedPINBlock;
	}

	public PINFormat1Code getPINFormat() {
		return pINFormat;
	}

	public void setPINFormat(PINFormat1Code pINFormat) {
		this.pINFormat = pINFormat;
	}

	public Max35Text getAdditionalInput() {
		return additionalInput;
	}

	public void setAdditionalInput(Max35Text additionalInput) {
		this.additionalInput = additionalInput;
	}
}