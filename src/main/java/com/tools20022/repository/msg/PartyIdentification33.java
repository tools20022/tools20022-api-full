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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionInstructionV01;
import com.tools20022.repository.choice.BeneficiaryCertificationType2Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.BeneficialOwner;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlternatePartyIdentification2;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmOwnerIdentification
 * PartyIdentification33.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmAlternateIdentification
 * PartyIdentification33.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmDomicileCountry
 * PartyIdentification33.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmNonDomicileCountry
 * PartyIdentification33.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmOwnedSecuritiesQuantity
 * PartyIdentification33.mmOwnedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmCertificationType
 * PartyIdentification33.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification33#mmDeclarationDetails
 * PartyIdentification33.mmDeclarationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01#mmBeneficialOwnerDetails
 * CorporateActionInstructionV01.mmBeneficialOwnerDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyIdentification33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the beneficial owner of the securities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule#forPartyIdentification33
 * ConstraintDeclarationDetailsRule.forPartyIdentification33}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification33", propOrder = {"ownerIdentification", "alternateIdentification", "domicileCountry", "nonDomicileCountry", "ownedSecuritiesQuantity", "certificationType", "declarationDetails"})
public class PartyIdentification33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OwnrId", required = true)
	protected PartyIdentification10Choice ownerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the beneficial owner of the specified quantity of securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::OWND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, PartyIdentification10Choice> mmOwnerIdentification = new MMMessageAttribute<PartyIdentification33, PartyIdentification10Choice>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "OwnrId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::OWND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerIdentification";
			definition = "Party that is the beneficial owner of the specified quantity of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public PartyIdentification10Choice getValue(PartyIdentification33 obj) {
			return obj.getOwnerIdentification();
		}

		@Override
		public void setValue(PartyIdentification33 obj, PartyIdentification10Choice value) {
			obj.setOwnerIdentification(value);
		}
	};
	@XmlElement(name = "AltrnId")
	protected List<AlternatePartyIdentification2> alternateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2
	 * AlternatePartyIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alternate identification for a party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, List<AlternatePartyIdentification2>> mmAlternateIdentification = new MMMessageAttribute<PartyIdentification33, List<AlternatePartyIdentification2>>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Alternate identification for a party.";
			minOccurs = 0;
			complexType_lazy = () -> AlternatePartyIdentification2.mmObject();
		}

		@Override
		public List<AlternatePartyIdentification2> getValue(PartyIdentification33 obj) {
			return obj.getAlternateIdentification();
		}

		@Override
		public void setValue(PartyIdentification33 obj, List<AlternatePartyIdentification2> value) {
			obj.setAlternateIdentification(value);
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
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmclCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which a person is permanently domiciled (the place of a persons permanent home)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94C::DOMI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, Optional<CountryCode>> mmDomicileCountry = new MMMessageAttribute<PartyIdentification33, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "DmclCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94C::DOMI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which a person is permanently domiciled (the place of a persons permanent home).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PartyIdentification33 obj) {
			return obj.getDomicileCountry();
		}

		@Override
		public void setValue(PartyIdentification33 obj, Optional<CountryCode> value) {
			obj.setDomicileCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "NonDmclCtry")
	protected List<CountryCode> nonDomicileCountry;
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
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonDmclCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Holder of the security certifies, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94C::NDOM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, List<CountryCode>> mmNonDomicileCountry = new MMMessageAttribute<PartyIdentification33, List<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "NonDmclCtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94C::NDOM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDomicileCountry";
			definition = "Holder of the security certifies, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public List<CountryCode> getValue(PartyIdentification33 obj) {
			return obj.getNonDomicileCountry();
		}

		@Override
		public void setValue(PartyIdentification33 obj, List<CountryCode> value) {
			obj.setNonDomicileCountry(value);
		}
	};
	@XmlElement(name = "OwndSctiesQty", required = true)
	protected FinancialInstrumentQuantity1Choice ownedSecuritiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwndSctiesQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnedSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities belonging to the beneficial owner specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::OWND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, FinancialInstrumentQuantity1Choice> mmOwnedSecuritiesQuantity = new MMMessageAttribute<PartyIdentification33, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "OwndSctiesQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::OWND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnedSecuritiesQuantity";
			definition = "Quantity of securities belonging to the beneficial owner specified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(PartyIdentification33 obj) {
			return obj.getOwnedSecuritiesQuantity();
		}

		@Override
		public void setValue(PartyIdentification33 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setOwnedSecuritiesQuantity(value);
		}
	};
	@XmlElement(name = "CertfctnTp")
	protected List<BeneficiaryCertificationType2Choice> certificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType2Choice
	 * BeneficiaryCertificationType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CETI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, List<BeneficiaryCertificationType2Choice>> mmCertificationType = new MMMessageAttribute<PartyIdentification33, List<BeneficiaryCertificationType2Choice>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CETI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType2Choice.mmObject();
		}

		@Override
		public List<BeneficiaryCertificationType2Choice> getValue(PartyIdentification33 obj) {
			return obj.getCertificationType();
		}

		@Override
		public void setValue(PartyIdentification33 obj, List<BeneficiaryCertificationType2Choice> value) {
			obj.setCertificationType(value);
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmDeclaration
	 * PartyIdentificationInformation.mmDeclaration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification33
	 * PartyIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DclrtnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details relative to the beneficial owner not included within structured fields of this message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::DECL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification33, Optional<Max350Text>> mmDeclarationDetails = new MMMessageAttribute<PartyIdentification33, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmDeclaration;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification33.mmObject();
			isDerived = false;
			xmlTag = "DclrtnDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::DECL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeclarationDetails";
			definition = "Provides details relative to the beneficial owner not included within structured fields of this message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PartyIdentification33 obj) {
			return obj.getDeclarationDetails();
		}

		@Override
		public void setValue(PartyIdentification33 obj, Optional<Max350Text> value) {
			obj.setDeclarationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification33.mmOwnerIdentification, com.tools20022.repository.msg.PartyIdentification33.mmAlternateIdentification,
						com.tools20022.repository.msg.PartyIdentification33.mmDomicileCountry, com.tools20022.repository.msg.PartyIdentification33.mmNonDomicileCountry,
						com.tools20022.repository.msg.PartyIdentification33.mmOwnedSecuritiesQuantity, com.tools20022.repository.msg.PartyIdentification33.mmCertificationType,
						com.tools20022.repository.msg.PartyIdentification33.mmDeclarationDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionInstructionV01.mmBeneficialOwnerDetails);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeclarationDetailsRule.forPartyIdentification33);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification33";
				definition = "Provides information about the beneficial owner of the securities.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification10Choice getOwnerIdentification() {
		return ownerIdentification;
	}

	public PartyIdentification33 setOwnerIdentification(PartyIdentification10Choice ownerIdentification) {
		this.ownerIdentification = Objects.requireNonNull(ownerIdentification);
		return this;
	}

	public List<AlternatePartyIdentification2> getAlternateIdentification() {
		return alternateIdentification == null ? alternateIdentification = new ArrayList<>() : alternateIdentification;
	}

	public PartyIdentification33 setAlternateIdentification(List<AlternatePartyIdentification2> alternateIdentification) {
		this.alternateIdentification = Objects.requireNonNull(alternateIdentification);
		return this;
	}

	public Optional<CountryCode> getDomicileCountry() {
		return domicileCountry == null ? Optional.empty() : Optional.of(domicileCountry);
	}

	public PartyIdentification33 setDomicileCountry(CountryCode domicileCountry) {
		this.domicileCountry = domicileCountry;
		return this;
	}

	public List<CountryCode> getNonDomicileCountry() {
		return nonDomicileCountry == null ? nonDomicileCountry = new ArrayList<>() : nonDomicileCountry;
	}

	public PartyIdentification33 setNonDomicileCountry(List<CountryCode> nonDomicileCountry) {
		this.nonDomicileCountry = Objects.requireNonNull(nonDomicileCountry);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getOwnedSecuritiesQuantity() {
		return ownedSecuritiesQuantity;
	}

	public PartyIdentification33 setOwnedSecuritiesQuantity(FinancialInstrumentQuantity1Choice ownedSecuritiesQuantity) {
		this.ownedSecuritiesQuantity = Objects.requireNonNull(ownedSecuritiesQuantity);
		return this;
	}

	public List<BeneficiaryCertificationType2Choice> getCertificationType() {
		return certificationType == null ? certificationType = new ArrayList<>() : certificationType;
	}

	public PartyIdentification33 setCertificationType(List<BeneficiaryCertificationType2Choice> certificationType) {
		this.certificationType = Objects.requireNonNull(certificationType);
		return this;
	}

	public Optional<Max350Text> getDeclarationDetails() {
		return declarationDetails == null ? Optional.empty() : Optional.of(declarationDetails);
	}

	public PartyIdentification33 setDeclarationDetails(Max350Text declarationDetails) {
		this.declarationDetails = declarationDetails;
		return this;
	}
}