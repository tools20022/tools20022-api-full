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
import com.tools20022.repository.choice.BeneficiaryCertificationType9Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the beneficial owner of the securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmBeneficialOwnerIdentification
 * BeneficialOwner2.mmBeneficialOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmAdditionalIdentification
 * BeneficialOwner2.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNationality
 * BeneficialOwner2.mmNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDomicileCountry
 * BeneficialOwner2.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNonDomicileCountry
 * BeneficialOwner2.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationIndicator
 * BeneficialOwner2.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationType
 * BeneficialOwner2.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDeclarationDetails
 * BeneficialOwner2.mmDeclarationDetails}</li>
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
 * "BeneficialOwner2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the beneficial owner of the securities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1 BeneficialOwner1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BeneficialOwner2", propOrder = {"beneficialOwnerIdentification", "additionalIdentification", "nationality", "domicileCountry", "nonDomicileCountry", "certificationIndicator", "certificationType", "declarationDetails"})
public class BeneficialOwner2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification100 beneficialOwnerIdentification;
	/**
	 * Identification of the party that is the beneficial owner of the specified
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the beneficial owner of the specified financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmBeneficialOwnerIdentification
	 * BeneficialOwner1.mmBeneficialOwnerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficialOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerIdentification";
			definition = "Identification of the party that is the beneficial owner of the specified financial instrument.";
			previousVersion_lazy = () -> BeneficialOwner1.mmBeneficialOwnerIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
		}
	};
	protected AlternateIdentification4 additionalIdentification;
	/**
	 * Additional identification of the party that is the beneficial owner of
	 * the specified financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification of the party that is the beneficial owner of the specified financial instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmAdditionalIdentification
	 * BeneficialOwner1.mmAdditionalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the party that is the beneficial owner of the specified financial instrument.";
			previousVersion_lazy = () -> BeneficialOwner1.mmAdditionalIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
		}
	};
	protected CountryCode nationality;
	/**
	 * Nationality of the beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntlty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nationality of the beneficial owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNationality
	 * BeneficialOwner1.mmNationality}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationality = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "Ntlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nationality";
			definition = "Nationality of the beneficial owner.";
			previousVersion_lazy = () -> BeneficialOwner1.mmNationality;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected CountryCode domicileCountry;
	/**
	 * Country in which the person is permanently domiciled (the place of a
	 * person's permanent home).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmDomicile
	 * Party.mmDomicile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmclCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the person is permanently domiciled (the place of a person's permanent home)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDomicileCountry
	 * BeneficialOwner1.mmDomicileCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmDomicile;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "DmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which the person is permanently domiciled (the place of a person's permanent home).";
			previousVersion_lazy = () -> BeneficialOwner1.mmDomicileCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected CountryCode nonDomicileCountry;
	/**
	 * Country for which the holder of the financial instrument must specify
	 * that it is not domiciled. (The holder must certify, in line with the
	 * terms of the corporate action, that it is not domiciled in the country
	 * indicated.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmNonDomicileCountry
	 * BeneficialOwner.mmNonDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDmclCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country for which the holder of the financial instrument must specify that it is not domiciled. (The holder must certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNonDomicileCountry
	 * BeneficialOwner1.mmNonDomicileCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonDomicileCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmNonDomicileCountry;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "Country for which the holder of the financial instrument must specify that it is not domiciled. (The holder must certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.)";
			previousVersion_lazy = () -> BeneficialOwner1.mmNonDomicileCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected YesNoIndicator certificationIndicator;
	/**
	 * Indicates whether certification is required from the account owner. (Yes
	 * means that certification is required. No means certification is not
	 * required.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether certification is required from the account owner. (Yes means that certification is required. No means certification is not required.)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationIndicator
	 * BeneficialOwner1.mmCertificationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether certification is required from the account owner. (Yes means that certification is required. No means certification is not required.)";
			previousVersion_lazy = () -> BeneficialOwner1.mmCertificationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BeneficiaryCertificationType9Choice certificationType;
	/**
	 * Type of beneficial owner certification that is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType9Choice
	 * BeneficiaryCertificationType9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of beneficial owner certification that is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationType
	 * BeneficialOwner1.mmCertificationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of beneficial owner certification that is required.";
			previousVersion_lazy = () -> BeneficialOwner1.mmCertificationType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType9Choice.mmObject();
		}
	};
	protected Max350Text declarationDetails;
	/**
	 * Declaration details related to the financial instrument, for example,
	 * beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDeclarationDetails
	 * Security.mmDeclarationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Declaration details related to the financial instrument, for example, beneficial ownership."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDeclarationDetails
	 * BeneficialOwner1.mmDeclarationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeclarationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDeclarationDetails;
			componentContext_lazy = () -> BeneficialOwner2.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Declaration details related to the financial instrument, for example, beneficial ownership.";
			previousVersion_lazy = () -> BeneficialOwner1.mmDeclarationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BeneficialOwner2.mmBeneficialOwnerIdentification, BeneficialOwner2.mmAdditionalIdentification, BeneficialOwner2.mmNationality, BeneficialOwner2.mmDomicileCountry,
						BeneficialOwner2.mmNonDomicileCountry, BeneficialOwner2.mmCertificationIndicator, BeneficialOwner2.mmCertificationType, BeneficialOwner2.mmDeclarationDetails);
				trace_lazy = () -> BeneficialOwner.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner2";
				definition = "Provides information about the beneficial owner of the securities.";
				previousVersion_lazy = () -> BeneficialOwner1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BnfclOwnrId", required = true)
	public PartyIdentification100 getBeneficialOwnerIdentification() {
		return beneficialOwnerIdentification;
	}

	public void setBeneficialOwnerIdentification(com.tools20022.repository.msg.PartyIdentification100 beneficialOwnerIdentification) {
		this.beneficialOwnerIdentification = beneficialOwnerIdentification;
	}

	@XmlElement(name = "AddtlId")
	public AlternateIdentification4 getAdditionalIdentification() {
		return additionalIdentification;
	}

	public void setAdditionalIdentification(com.tools20022.repository.msg.AlternateIdentification4 additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
	}

	@XmlElement(name = "Ntlty")
	public CountryCode getNationality() {
		return nationality;
	}

	public void setNationality(CountryCode nationality) {
		this.nationality = nationality;
	}

	@XmlElement(name = "DmclCtry")
	public CountryCode getDomicileCountry() {
		return domicileCountry;
	}

	public void setDomicileCountry(CountryCode domicileCountry) {
		this.domicileCountry = domicileCountry;
	}

	@XmlElement(name = "NonDmclCtry")
	public CountryCode getNonDomicileCountry() {
		return nonDomicileCountry;
	}

	public void setNonDomicileCountry(CountryCode nonDomicileCountry) {
		this.nonDomicileCountry = nonDomicileCountry;
	}

	@XmlElement(name = "CertfctnInd")
	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
	}

	@XmlElement(name = "CertfctnTp")
	public BeneficiaryCertificationType9Choice getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(BeneficiaryCertificationType9Choice certificationType) {
		this.certificationType = certificationType;
	}

	@XmlElement(name = "DclrtnDtls")
	public Max350Text getDeclarationDetails() {
		return declarationDetails;
	}

	public void setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
	}
}