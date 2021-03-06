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
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IssuanceAccount2;
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
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmValidFrom
 * SecurityCSDLink5.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmValidTo
 * SecurityCSDLink5.mmValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmSecurityMaintenance
 * SecurityCSDLink5.mmSecurityMaintenance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmIssuerCSD
 * SecurityCSDLink5.mmIssuerCSD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmInvestorCSD
 * SecurityCSDLink5.mmInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmTechnicalIssuerCSD
 * SecurityCSDLink5.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5#mmIssuanceAccount
 * SecurityCSDLink5.mmIssuanceAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCSDLink5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1 SecurityCSDLink1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityCSDLink5", propOrder = {"validFrom", "validTo", "securityMaintenance", "issuerCSD", "investorCSD", "technicalIssuerCSD", "issuanceAccount"})
public class SecurityCSDLink5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmValidFrom
	 * SecurityCSDLink1.mmValidFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink5, DateAndDateTimeChoice> mmValidFrom = new MMMessageAttribute<SecurityCSDLink5, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Defines the date since when the CSD is linked to the security.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmValidFrom;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SecurityCSDLink5 obj) {
			return obj.getValidFrom();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, DateAndDateTimeChoice value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmValidTo
	 * SecurityCSDLink1.mmValidTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink5, Optional<DateAndDateTimeChoice>> mmValidTo = new MMMessageAttribute<SecurityCSDLink5, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Defines the date until when the CSD is linked to the security.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmValidTo;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecurityCSDLink5 obj) {
			return obj.getValidTo();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValidTo(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyMntnc")
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyMntnc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityMaintenance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specify if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmSecurityMaintenance
	 * SecurityCSDLink1.mmSecurityMaintenance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink5, Optional<YesNoIndicator>> mmSecurityMaintenance = new MMMessageAttribute<SecurityCSDLink5, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "SctyMntnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityMaintenance";
			definition = "Specify if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmSecurityMaintenance;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecurityCSDLink5 obj) {
			return obj.getSecurityMaintenance();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, Optional<YesNoIndicator> value) {
			obj.setSecurityMaintenance(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrCSD")
	protected SystemPartyIdentification1Choice issuerCSD;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmIssuerCSD
	 * SecurityCSDLink1.mmIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>> mmIssuerCSD = new MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "CSD Issuer of a security.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmIssuerCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecurityCSDLink5 obj) {
			return obj.getIssuerCSD();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setIssuerCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstrCSD")
	protected SystemPartyIdentification1Choice investorCSD;
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Investor of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmInvestorCSD
	 * SecurityCSDLink1.mmInvestorCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>> mmInvestorCSD = new MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "CSD Investor of a security.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmInvestorCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecurityCSDLink5 obj) {
			return obj.getInvestorCSD();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setInvestorCSD(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmTechnicalIssuerCSD
	 * SecurityCSDLink1.mmTechnicalIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>> mmTechnicalIssuerCSD = new MMMessageAssociationEnd<SecurityCSDLink5, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmTechnicalIssuerCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecurityCSDLink5 obj) {
			return obj.getTechnicalIssuerCSD();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setTechnicalIssuerCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "IssncAcct")
	protected List<IssuanceAccount2> issuanceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount2
	 * IssuanceAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink5
	 * SecurityCSDLink5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmIssuanceAccount
	 * SecurityCSDLink1.mmIssuanceAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink5, List<IssuanceAccount2>> mmIssuanceAccount = new MMMessageAttribute<SecurityCSDLink5, List<IssuanceAccount2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink5.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> SecurityCSDLink1.mmIssuanceAccount;
			minOccurs = 0;
			complexType_lazy = () -> IssuanceAccount2.mmObject();
		}

		@Override
		public List<IssuanceAccount2> getValue(SecurityCSDLink5 obj) {
			return obj.getIssuanceAccount();
		}

		@Override
		public void setValue(SecurityCSDLink5 obj, List<IssuanceAccount2> value) {
			obj.setIssuanceAccount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityCSDLink5.mmValidFrom, com.tools20022.repository.msg.SecurityCSDLink5.mmValidTo,
						com.tools20022.repository.msg.SecurityCSDLink5.mmSecurityMaintenance, com.tools20022.repository.msg.SecurityCSDLink5.mmIssuerCSD, com.tools20022.repository.msg.SecurityCSDLink5.mmInvestorCSD,
						com.tools20022.repository.msg.SecurityCSDLink5.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecurityCSDLink5.mmIssuanceAccount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCSDLink5";
				definition = "Defines how the CSD is linked to the security.";
				previousVersion_lazy = () -> SecurityCSDLink1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DateAndDateTimeChoice getValidFrom() {
		return validFrom;
	}

	public SecurityCSDLink5 setValidFrom(DateAndDateTimeChoice validFrom) {
		this.validFrom = Objects.requireNonNull(validFrom);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValidTo() {
		return validTo == null ? Optional.empty() : Optional.of(validTo);
	}

	public SecurityCSDLink5 setValidTo(DateAndDateTimeChoice validTo) {
		this.validTo = validTo;
		return this;
	}

	public Optional<YesNoIndicator> getSecurityMaintenance() {
		return securityMaintenance == null ? Optional.empty() : Optional.of(securityMaintenance);
	}

	public SecurityCSDLink5 setSecurityMaintenance(YesNoIndicator securityMaintenance) {
		this.securityMaintenance = securityMaintenance;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getIssuerCSD() {
		return issuerCSD == null ? Optional.empty() : Optional.of(issuerCSD);
	}

	public SecurityCSDLink5 setIssuerCSD(SystemPartyIdentification1Choice issuerCSD) {
		this.issuerCSD = issuerCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getInvestorCSD() {
		return investorCSD == null ? Optional.empty() : Optional.of(investorCSD);
	}

	public SecurityCSDLink5 setInvestorCSD(SystemPartyIdentification1Choice investorCSD) {
		this.investorCSD = investorCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getTechnicalIssuerCSD() {
		return technicalIssuerCSD == null ? Optional.empty() : Optional.of(technicalIssuerCSD);
	}

	public SecurityCSDLink5 setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
		return this;
	}

	public List<IssuanceAccount2> getIssuanceAccount() {
		return issuanceAccount == null ? issuanceAccount = new ArrayList<>() : issuanceAccount;
	}

	public SecurityCSDLink5 setIssuanceAccount(List<IssuanceAccount2> issuanceAccount) {
		this.issuanceAccount = Objects.requireNonNull(issuanceAccount);
		return this;
	}
}