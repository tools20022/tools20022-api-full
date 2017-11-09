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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PINFormat4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5#mmEncryptedPINBlock
 * OnLinePIN5.mmEncryptedPINBlock}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5#mmPINFormat
 * OnLinePIN5.mmPINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN5#mmAdditionalInput
 * OnLinePIN5.mmAdditionalInput}</li>
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
 * "OnLinePIN5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Encrypted personal identification number (PIN) and related information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OnLinePIN4
 * OnLinePIN4}</li>
 * </ul>
 */
public class OnLinePIN5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentInformationType10 encryptedPINBlock;
	/**
	 * Encrypted PIN (Personal Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN5
	 * OnLinePIN5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OnLinePIN4#mmEncryptedPINBlock
	 * OnLinePIN4.mmEncryptedPINBlock}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryptedPINBlock = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OnLinePIN5.mmObject();
			isDerived = false;
			xmlTag = "NcrptdPINBlck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedPINBlock";
			definition = "Encrypted PIN (Personal Identification Number).";
			previousVersion_lazy = () -> OnLinePIN4.mmEncryptedPINBlock;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected PINFormat4Code pINFormat;
	/**
	 * PIN (Personal Identification Number) format before encryption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat4Code
	 * PINFormat4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmPINFormat
	 * Authentication.mmPINFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN5
	 * OnLinePIN5}</li>
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
	 * definition} =
	 * "PIN (Personal Identification Number) format before encryption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OnLinePIN4#mmPINFormat
	 * OnLinePIN4.mmPINFormat}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPINFormat = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmPINFormat;
			componentContext_lazy = () -> OnLinePIN5.mmObject();
			isDerived = false;
			xmlTag = "PINFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINFormat";
			definition = "PIN (Personal Identification Number) format before encryption.";
			previousVersion_lazy = () -> OnLinePIN4.mmPINFormat;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormat4Code.mmObject();
		}
	};
	protected Max35Text additionalInput;
	/**
	 * Additional information required to verify the PIN (Personal
	 * Identification Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN5
	 * OnLinePIN5}</li>
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
	 * definition} =
	 * "Additional information required to verify the PIN (Personal Identification Number)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OnLinePIN4#mmAdditionalInput
	 * OnLinePIN4.mmAdditionalInput}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInput = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OnLinePIN5.mmObject();
			isDerived = false;
			xmlTag = "AddtlInpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInput";
			definition = "Additional information required to verify the PIN (Personal Identification Number).";
			previousVersion_lazy = () -> OnLinePIN4.mmAdditionalInput;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OnLinePIN5.mmEncryptedPINBlock, OnLinePIN5.mmPINFormat, OnLinePIN5.mmAdditionalInput);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLinePIN5";
				definition = "Encrypted personal identification number (PIN) and related information.";
				previousVersion_lazy = () -> OnLinePIN4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentInformationType10 getEncryptedPINBlock() {
		return encryptedPINBlock;
	}

	public void setEncryptedPINBlock(com.tools20022.repository.msg.ContentInformationType10 encryptedPINBlock) {
		this.encryptedPINBlock = encryptedPINBlock;
	}

	public PINFormat4Code getPINFormat() {
		return pINFormat;
	}

	public void setPINFormat(PINFormat4Code pINFormat) {
		this.pINFormat = pINFormat;
	}

	public Max35Text getAdditionalInput() {
		return additionalInput;
	}

	public void setAdditionalInput(Max35Text additionalInput) {
		this.additionalInput = additionalInput;
	}
}