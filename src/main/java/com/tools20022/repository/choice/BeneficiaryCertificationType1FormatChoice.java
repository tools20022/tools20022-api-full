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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.BeneficiaryCertificationType1Code;
import com.tools20022.repository.entity.BeneficialOwner;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats to express the type of beneficiary's certification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmCode
 * BeneficiaryCertificationType1FormatChoice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice#mmProprietary
 * BeneficiaryCertificationType1FormatChoice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
 * BeneficialOwner}</li>
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
 * "BeneficiaryCertificationType1FormatChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of formats to  express the type of beneficiary's certification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BeneficiaryCertificationType1FormatChoice", propOrder = {"code", "proprietary"})
public class BeneficiaryCertificationType1FormatChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected BeneficiaryCertificationType1Code code;
	/**
	 * Standard code to specify the type of beneficiary's certification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationType1Code
	 * BeneficiaryCertificationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standard code to  specify the type of beneficiary's certification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Standard code to  specify the type of beneficiary's certification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationType1Code.mmObject();
		}
	};
	protected GenericIdentification13 proprietary;
	/**
	 * Proprietary code to express the type of beneficiary's certification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification13
	 * GenericIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary code to  express the type of beneficiary's certification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary code to  express the type of beneficiary's certification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification13.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BeneficiaryCertificationType1FormatChoice.mmCode, BeneficiaryCertificationType1FormatChoice.mmProprietary);
				trace_lazy = () -> BeneficialOwner.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationType1FormatChoice";
				definition = "Choice of formats to  express the type of beneficiary's certification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cd", required = true)
	public BeneficiaryCertificationType1Code getCode() {
		return code;
	}

	public void setCode(BeneficiaryCertificationType1Code code) {
		this.code = code;
	}

	@XmlElement(name = "Prtry", required = true)
	public GenericIdentification13 getProprietary() {
		return proprietary;
	}

	public void setProprietary(GenericIdentification13 proprietary) {
		this.proprietary = proprietary;
	}
}