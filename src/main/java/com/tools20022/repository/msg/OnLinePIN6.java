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
import com.tools20022.repository.codeset.PINFormat3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType17;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encrypted personal identification number (PIN) and related information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN6#mmEncryptedPINBlock
 * OnLinePIN6.mmEncryptedPINBlock}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN6#mmPINFormat
 * OnLinePIN6.mmPINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OnLinePIN6#mmAdditionalInput
 * OnLinePIN6.mmAdditionalInput}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
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
 * "OnLinePIN6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Encrypted personal identification number (PIN) and related information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.OnLinePIN4
 * OnLinePIN4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OnLinePIN6", propOrder = {"encryptedPINBlock", "pINFormat", "additionalInput"})
public class OnLinePIN6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NcrptdPINBlck", required = true)
	protected ContentInformationType17 encryptedPINBlock;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType17
	 * ContentInformationType17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN6
	 * OnLinePIN6}</li>
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
	public static final MMMessageAssociationEnd<OnLinePIN6, ContentInformationType17> mmEncryptedPINBlock = new MMMessageAssociationEnd<OnLinePIN6, ContentInformationType17>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OnLinePIN6.mmObject();
			isDerived = false;
			xmlTag = "NcrptdPINBlck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedPINBlock";
			definition = "Encrypted PIN (Personal Identification Number).";
			previousVersion_lazy = () -> OnLinePIN4.mmEncryptedPINBlock;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ContentInformationType17.mmObject();
		}

		@Override
		public ContentInformationType17 getValue(OnLinePIN6 obj) {
			return obj.getEncryptedPINBlock();
		}

		@Override
		public void setValue(OnLinePIN6 obj, ContentInformationType17 value) {
			obj.setEncryptedPINBlock(value);
		}
	};
	@XmlElement(name = "PINFrmt", required = true)
	protected PINFormat3Code pINFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormat3Code
	 * PINFormat3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmPINFormat
	 * Authentication.mmPINFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN6
	 * OnLinePIN6}</li>
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
	public static final MMMessageAttribute<OnLinePIN6, PINFormat3Code> mmPINFormat = new MMMessageAttribute<OnLinePIN6, PINFormat3Code>() {
		{
			businessElementTrace_lazy = () -> Authentication.mmPINFormat;
			componentContext_lazy = () -> com.tools20022.repository.msg.OnLinePIN6.mmObject();
			isDerived = false;
			xmlTag = "PINFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINFormat";
			definition = "PIN (Personal Identification Number) format before encryption.";
			previousVersion_lazy = () -> OnLinePIN4.mmPINFormat;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormat3Code.mmObject();
		}

		@Override
		public PINFormat3Code getValue(OnLinePIN6 obj) {
			return obj.getPINFormat();
		}

		@Override
		public void setValue(OnLinePIN6 obj, PINFormat3Code value) {
			obj.setPINFormat(value);
		}
	};
	@XmlElement(name = "AddtlInpt")
	protected Max35Text additionalInput;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.OnLinePIN6
	 * OnLinePIN6}</li>
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
	public static final MMMessageAttribute<OnLinePIN6, Optional<Max35Text>> mmAdditionalInput = new MMMessageAttribute<OnLinePIN6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OnLinePIN6.mmObject();
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

		@Override
		public Optional<Max35Text> getValue(OnLinePIN6 obj) {
			return obj.getAdditionalInput();
		}

		@Override
		public void setValue(OnLinePIN6 obj, Optional<Max35Text> value) {
			obj.setAdditionalInput(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OnLinePIN6.mmEncryptedPINBlock, com.tools20022.repository.msg.OnLinePIN6.mmPINFormat, com.tools20022.repository.msg.OnLinePIN6.mmAdditionalInput);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLinePIN6";
				definition = "Encrypted personal identification number (PIN) and related information.";
				previousVersion_lazy = () -> OnLinePIN4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentInformationType17 getEncryptedPINBlock() {
		return encryptedPINBlock;
	}

	public OnLinePIN6 setEncryptedPINBlock(ContentInformationType17 encryptedPINBlock) {
		this.encryptedPINBlock = Objects.requireNonNull(encryptedPINBlock);
		return this;
	}

	public PINFormat3Code getPINFormat() {
		return pINFormat;
	}

	public OnLinePIN6 setPINFormat(PINFormat3Code pINFormat) {
		this.pINFormat = Objects.requireNonNull(pINFormat);
		return this;
	}

	public Optional<Max35Text> getAdditionalInput() {
		return additionalInput == null ? Optional.empty() : Optional.of(additionalInput);
	}

	public OnLinePIN6 setAdditionalInput(Max35Text additionalInput) {
		this.additionalInput = additionalInput;
		return this;
	}
}