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
import com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification16;
import com.tools20022.repository.msg.SecurityIdentification7;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmBeneficialOwnerIdentification
 * BeneficialOwner1.mmBeneficialOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmAdditionalIdentification
 * BeneficialOwner1.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNationality
 * BeneficialOwner1.mmNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDomicileCountry
 * BeneficialOwner1.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmNonDomicileCountry
 * BeneficialOwner1.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationIndicator
 * BeneficialOwner1.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmCertificationType
 * BeneficialOwner1.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmDeclarationDetails
 * BeneficialOwner1.mmDeclarationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmSecurityIdentification
 * BeneficialOwner1.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1#mmElectedSecuritiesQuantity
 * BeneficialOwner1.mmElectedSecuritiesQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
 * BeneficialOwner}</li>
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
 * "BeneficialOwner1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the beneficial owner of the securities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BeneficialOwner2
 * BeneficialOwner2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BeneficialOwner1", propOrder = {"beneficialOwnerIdentification", "additionalIdentification", "nationality", "domicileCountry", "nonDomicileCountry", "certificationIndicator", "certificationType", "declarationDetails",
		"securityIdentification", "electedSecuritiesQuantity"})
public class BeneficialOwner1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BnfclOwnrId", required = true)
	protected PartyIdentification2Choice beneficialOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "Identification of the party that is the beneficial owner of the specified securities."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmBeneficialOwnerIdentification
	 * BeneficialOwner2.mmBeneficialOwnerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, PartyIdentification2Choice> mmBeneficialOwnerIdentification = new MMMessageAttribute<BeneficialOwner1, PartyIdentification2Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerIdentification";
			definition = "Identification of the party that is the beneficial owner of the specified securities.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmBeneficialOwnerIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public PartyIdentification2Choice getValue(BeneficialOwner1 obj) {
			return obj.getBeneficialOwnerIdentification();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, PartyIdentification2Choice value) {
			obj.setBeneficialOwnerIdentification(value);
		}
	};
	@XmlElement(name = "AddtlId")
	protected GenericIdentification16 additionalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification16
	 * GenericIdentification16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "Additional identification of the party that is the beneficial owner of the specified securities."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmAdditionalIdentification
	 * BeneficialOwner2.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<GenericIdentification16>> mmAdditionalIdentification = new MMMessageAttribute<BeneficialOwner1, Optional<GenericIdentification16>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the party that is the beneficial owner of the specified securities.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmAdditionalIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification16.mmObject();
		}

		@Override
		public Optional<GenericIdentification16> getValue(BeneficialOwner1 obj) {
			return obj.getAdditionalIdentification();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<GenericIdentification16> value) {
			obj.setAdditionalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Ntlty")
	protected CountryCode nationality;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNationality
	 * BeneficialOwner2.mmNationality}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>> mmNationality = new MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "Ntlty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nationality";
			definition = "Nationality of the beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmNationality);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(BeneficialOwner1 obj) {
			return obj.getNationality();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<CountryCode> value) {
			obj.setNationality(value.orElse(null));
		}
	};
	@XmlElement(name = "DmclCtry")
	protected CountryCode domicileCountry;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "Country in which a person is permanently domiciled (the place of a persons permanent home)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDomicileCountry
	 * BeneficialOwner2.mmDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>> mmDomicileCountry = new MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Party.mmDomicile;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "DmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which a person is permanently domiciled (the place of a persons permanent home).";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmDomicileCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(BeneficialOwner1 obj) {
			return obj.getDomicileCountry();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<CountryCode> value) {
			obj.setDomicileCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "NonDmclCtry")
	protected CountryCode nonDomicileCountry;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmNonDomicileCountry
	 * BeneficialOwner2.mmNonDomicileCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>> mmNonDomicileCountry = new MMMessageAttribute<BeneficialOwner1, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmNonDomicileCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmNonDomicileCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(BeneficialOwner1 obj) {
			return obj.getNonDomicileCountry();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<CountryCode> value) {
			obj.setNonDomicileCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnInd")
	protected YesNoIndicator certificationIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationIndicator
	 * BeneficialOwner2.mmCertificationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<YesNoIndicator>> mmCertificationIndicator = new MMMessageAttribute<BeneficialOwner1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Whether or not certification is required from the account owner. \nYes: certification required \nNo: no certification required.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmCertificationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(BeneficialOwner1 obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected BeneficiaryCertificationType1FormatChoice certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * definition} = "Type of certification which is required."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmCertificationType
	 * BeneficialOwner2.mmCertificationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<BeneficiaryCertificationType1FormatChoice>> mmCertificationType = new MMMessageAttribute<BeneficialOwner1, Optional<BeneficiaryCertificationType1FormatChoice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmCertificationType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
		}

		@Override
		public Optional<BeneficiaryCertificationType1FormatChoice> getValue(BeneficialOwner1 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<BeneficiaryCertificationType1FormatChoice> value) {
			obj.setCertificationType(value.orElse(null));
		}
	};
	@XmlElement(name = "DclrtnDtls")
	protected Max350Text declarationDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
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
	 * "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner2#mmDeclarationDetails
	 * BeneficialOwner2.mmDeclarationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<Max350Text>> mmDeclarationDetails = new MMMessageAttribute<BeneficialOwner1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDeclarationDetails;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides declaration details narrative relative to the financial instrument, eg, beneficial ownership.";
			nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmDeclarationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(BeneficialOwner1 obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<Max350Text> value) {
			obj.setDeclarationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyId")
	protected SecurityIdentification7 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification7
	 * SecurityIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, Optional<SecurityIdentification7>> mmSecurityIdentification = new MMMessageAttribute<BeneficialOwner1, Optional<SecurityIdentification7>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification7.mmObject();
		}

		@Override
		public Optional<SecurityIdentification7> getValue(BeneficialOwner1 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, Optional<SecurityIdentification7> value) {
			obj.setSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctdSctiesQty", required = true)
	protected UnitOrFaceAmount1Choice electedSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctdSctiesQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectedSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities elected by to the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficialOwner1, UnitOrFaceAmount1Choice> mmElectedSecuritiesQuantity = new MMMessageAttribute<BeneficialOwner1, UnitOrFaceAmount1Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
			isDerived = false;
			xmlTag = "ElctdSctiesQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectedSecuritiesQuantity";
			definition = "Quantity of securities elected by to the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public UnitOrFaceAmount1Choice getValue(BeneficialOwner1 obj) {
			return obj.getElectedSecuritiesQuantity();
		}

		@Override
		public void setValue(BeneficialOwner1 obj, UnitOrFaceAmount1Choice value) {
			obj.setElectedSecuritiesQuantity(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficialOwner1.mmBeneficialOwnerIdentification, com.tools20022.repository.msg.BeneficialOwner1.mmAdditionalIdentification,
						com.tools20022.repository.msg.BeneficialOwner1.mmNationality, com.tools20022.repository.msg.BeneficialOwner1.mmDomicileCountry, com.tools20022.repository.msg.BeneficialOwner1.mmNonDomicileCountry,
						com.tools20022.repository.msg.BeneficialOwner1.mmCertificationIndicator, com.tools20022.repository.msg.BeneficialOwner1.mmCertificationType, com.tools20022.repository.msg.BeneficialOwner1.mmDeclarationDetails,
						com.tools20022.repository.msg.BeneficialOwner1.mmSecurityIdentification, com.tools20022.repository.msg.BeneficialOwner1.mmElectedSecuritiesQuantity);
				trace_lazy = () -> BeneficialOwner.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner1";
				definition = "Provides information about the beneficial owner of the securities.";
				nextVersions_lazy = () -> Arrays.asList(BeneficialOwner2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification2Choice getBeneficialOwnerIdentification() {
		return beneficialOwnerIdentification;
	}

	public BeneficialOwner1 setBeneficialOwnerIdentification(PartyIdentification2Choice beneficialOwnerIdentification) {
		this.beneficialOwnerIdentification = Objects.requireNonNull(beneficialOwnerIdentification);
		return this;
	}

	public Optional<GenericIdentification16> getAdditionalIdentification() {
		return additionalIdentification == null ? Optional.empty() : Optional.of(additionalIdentification);
	}

	public BeneficialOwner1 setAdditionalIdentification(GenericIdentification16 additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
		return this;
	}

	public Optional<CountryCode> getNationality() {
		return nationality == null ? Optional.empty() : Optional.of(nationality);
	}

	public BeneficialOwner1 setNationality(CountryCode nationality) {
		this.nationality = nationality;
		return this;
	}

	public Optional<CountryCode> getDomicileCountry() {
		return domicileCountry == null ? Optional.empty() : Optional.of(domicileCountry);
	}

	public BeneficialOwner1 setDomicileCountry(CountryCode domicileCountry) {
		this.domicileCountry = domicileCountry;
		return this;
	}

	public Optional<CountryCode> getNonDomicileCountry() {
		return nonDomicileCountry == null ? Optional.empty() : Optional.of(nonDomicileCountry);
	}

	public BeneficialOwner1 setNonDomicileCountry(CountryCode nonDomicileCountry) {
		this.nonDomicileCountry = nonDomicileCountry;
		return this;
	}

	public Optional<YesNoIndicator> getCertificationIndicator() {
		return certificationIndicator == null ? Optional.empty() : Optional.of(certificationIndicator);
	}

	public BeneficialOwner1 setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
		return this;
	}

	public Optional<BeneficiaryCertificationType1FormatChoice> getCertificationType() {
		return certificationType == null ? Optional.empty() : Optional.of(certificationType);
	}

	public BeneficialOwner1 setCertificationType(BeneficiaryCertificationType1FormatChoice certificationType) {
		this.certificationType = certificationType;
		return this;
	}

	public Optional<Max350Text> getDeclarationDetails() {
		return declarationDetails == null ? Optional.empty() : Optional.of(declarationDetails);
	}

	public BeneficialOwner1 setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
		return this;
	}

	public Optional<SecurityIdentification7> getSecurityIdentification() {
		return securityIdentification == null ? Optional.empty() : Optional.of(securityIdentification);
	}

	public BeneficialOwner1 setSecurityIdentification(SecurityIdentification7 securityIdentification) {
		this.securityIdentification = securityIdentification;
		return this;
	}

	public UnitOrFaceAmount1Choice getElectedSecuritiesQuantity() {
		return electedSecuritiesQuantity;
	}

	public BeneficialOwner1 setElectedSecuritiesQuantity(UnitOrFaceAmount1Choice electedSecuritiesQuantity) {
		this.electedSecuritiesQuantity = Objects.requireNonNull(electedSecuritiesQuantity);
		return this;
	}
}