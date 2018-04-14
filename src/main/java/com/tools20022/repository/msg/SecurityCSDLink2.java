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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.IssuerOrInvestor1Choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IssuanceAccount1;
import com.tools20022.repository.msg.SecurityIdentification14;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines how the CSD is linked to the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmFinancialInstrumentIdentification
 * SecurityCSDLink2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmIssuerInvestorCSD
 * SecurityCSDLink2.mmIssuerInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmTechnicalIssuerCSD
 * SecurityCSDLink2.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmSecurityMaintenance
 * SecurityCSDLink2.mmSecurityMaintenance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmIssuanceAccount
 * SecurityCSDLink2.mmIssuanceAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmValidFrom
 * SecurityCSDLink2.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmValidTo
 * SecurityCSDLink2.mmValidTo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCSDLink2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink4
 * SecurityCSDLink4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityCSDLink2", propOrder = {"financialInstrumentIdentification", "issuerInvestorCSD", "technicalIssuerCSD", "securityMaintenance", "issuanceAccount", "validFrom", "validTo"})
public class SecurityCSDLink2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmFinancialInstrumentIdentification
	 * SecurityCSDLink4.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink2, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageAttribute<SecurityCSDLink2, SecurityIdentification14>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(SecurityCSDLink2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "IssrInvstrCSD", required = true)
	protected IssuerOrInvestor1Choice issuerInvestorCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1Choice
	 * IssuerOrInvestor1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrInvstrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmIssuerInvestorCSD
	 * SecurityCSDLink4.mmIssuerInvestorCSD}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink2, IssuerOrInvestor1Choice> mmIssuerInvestorCSD = new MMMessageAttribute<SecurityCSDLink2, IssuerOrInvestor1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "IssrInvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInvestorCSD";
			definition = "CSD Issuer of a security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmIssuerInvestorCSD);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerOrInvestor1Choice.mmObject();
		}

		@Override
		public IssuerOrInvestor1Choice getValue(SecurityCSDLink2 obj) {
			return obj.getIssuerInvestorCSD();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, IssuerOrInvestor1Choice value) {
			obj.setIssuerInvestorCSD(value);
		}
	};
	@XmlElement(name = "TechIssrCSD")
	protected SystemPartyIdentification1Choice technicalIssuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechIssrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmTechnicalIssuerCSD
	 * SecurityCSDLink4.mmTechnicalIssuerCSD}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink2, Optional<SystemPartyIdentification1Choice>> mmTechnicalIssuerCSD = new MMMessageAssociationEnd<SecurityCSDLink2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmTechnicalIssuerCSD);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecurityCSDLink2 obj) {
			return obj.getTechnicalIssuerCSD();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setTechnicalIssuerCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyMntnc", required = true)
	protected YesNoIndicator securityMaintenance;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyMntnc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityMaintenance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmSecurityMaintenance
	 * SecurityCSDLink4.mmSecurityMaintenance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink2, YesNoIndicator> mmSecurityMaintenance = new MMMessageAttribute<SecurityCSDLink2, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "SctyMntnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityMaintenance";
			definition = "Specifies if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.\r\n";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmSecurityMaintenance);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecurityCSDLink2 obj) {
			return obj.getSecurityMaintenance();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, YesNoIndicator value) {
			obj.setSecurityMaintenance(value);
		}
	};
	@XmlElement(name = "IssncAcct")
	protected List<IssuanceAccount1> issuanceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IssuanceAccount1
	 * IssuanceAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmIssuanceAccount
	 * SecurityCSDLink4.mmIssuanceAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink2, List<IssuanceAccount1>> mmIssuanceAccount = new MMMessageAssociationEnd<SecurityCSDLink2, List<IssuanceAccount1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmIssuanceAccount);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IssuanceAccount1.mmObject();
		}

		@Override
		public List<IssuanceAccount1> getValue(SecurityCSDLink2 obj) {
			return obj.getIssuanceAccount();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, List<IssuanceAccount1> value) {
			obj.setIssuanceAccount(value);
		}
	};
	@XmlElement(name = "VldFr", required = true)
	protected DateAndDateTimeChoice validFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date since when the CSD is linked to the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmValidFrom
	 * SecurityCSDLink4.mmValidFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink2, DateAndDateTimeChoice> mmValidFrom = new MMMessageAttribute<SecurityCSDLink2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Defines the date since when the CSD is linked to the security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmValidFrom);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SecurityCSDLink2 obj) {
			return obj.getValidFrom();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, DateAndDateTimeChoice value) {
			obj.setValidFrom(value);
		}
	};
	@XmlElement(name = "VldTo")
	protected DateAndDateTimeChoice validTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date until when the CSD is linked to the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmValidTo
	 * SecurityCSDLink4.mmValidTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink2, Optional<DateAndDateTimeChoice>> mmValidTo = new MMMessageAttribute<SecurityCSDLink2, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Defines the date until when the CSD is linked to the security.";
			nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmValidTo);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecurityCSDLink2 obj) {
			return obj.getValidTo();
		}

		@Override
		public void setValue(SecurityCSDLink2 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValidTo(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityCSDLink2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecurityCSDLink2.mmIssuerInvestorCSD,
						com.tools20022.repository.msg.SecurityCSDLink2.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecurityCSDLink2.mmSecurityMaintenance, com.tools20022.repository.msg.SecurityCSDLink2.mmIssuanceAccount,
						com.tools20022.repository.msg.SecurityCSDLink2.mmValidFrom, com.tools20022.repository.msg.SecurityCSDLink2.mmValidTo);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCSDLink2";
				definition = "Defines how the CSD is linked to the security.";
				nextVersions_lazy = () -> Arrays.asList(SecurityCSDLink4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecurityCSDLink2 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public IssuerOrInvestor1Choice getIssuerInvestorCSD() {
		return issuerInvestorCSD;
	}

	public SecurityCSDLink2 setIssuerInvestorCSD(IssuerOrInvestor1Choice issuerInvestorCSD) {
		this.issuerInvestorCSD = Objects.requireNonNull(issuerInvestorCSD);
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getTechnicalIssuerCSD() {
		return technicalIssuerCSD == null ? Optional.empty() : Optional.of(technicalIssuerCSD);
	}

	public SecurityCSDLink2 setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
		return this;
	}

	public YesNoIndicator getSecurityMaintenance() {
		return securityMaintenance;
	}

	public SecurityCSDLink2 setSecurityMaintenance(YesNoIndicator securityMaintenance) {
		this.securityMaintenance = Objects.requireNonNull(securityMaintenance);
		return this;
	}

	public List<IssuanceAccount1> getIssuanceAccount() {
		return issuanceAccount == null ? issuanceAccount = new ArrayList<>() : issuanceAccount;
	}

	public SecurityCSDLink2 setIssuanceAccount(List<IssuanceAccount1> issuanceAccount) {
		this.issuanceAccount = Objects.requireNonNull(issuanceAccount);
		return this;
	}

	public DateAndDateTimeChoice getValidFrom() {
		return validFrom;
	}

	public SecurityCSDLink2 setValidFrom(DateAndDateTimeChoice validFrom) {
		this.validFrom = Objects.requireNonNull(validFrom);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValidTo() {
		return validTo == null ? Optional.empty() : Optional.of(validTo);
	}

	public SecurityCSDLink2 setValidTo(DateAndDateTimeChoice validTo) {
		this.validTo = validTo;
		return this;
	}
}