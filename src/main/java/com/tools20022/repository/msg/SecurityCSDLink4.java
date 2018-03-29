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
import com.tools20022.repository.msg.IssuanceAccount2;
import com.tools20022.repository.msg.SecurityIdentification19;
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
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmFinancialInstrumentIdentification
 * SecurityCSDLink4.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmIssuerInvestorCSD
 * SecurityCSDLink4.mmIssuerInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmTechnicalIssuerCSD
 * SecurityCSDLink4.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmSecurityMaintenance
 * SecurityCSDLink4.mmSecurityMaintenance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmIssuanceAccount
 * SecurityCSDLink4.mmIssuanceAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmValidFrom
 * SecurityCSDLink4.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink4#mmValidTo
 * SecurityCSDLink4.mmValidTo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCSDLink4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2 SecurityCSDLink2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityCSDLink4", propOrder = {"financialInstrumentIdentification", "issuerInvestorCSD", "technicalIssuerCSD", "securityMaintenance", "issuanceAccount", "validFrom", "validTo"})
public class SecurityCSDLink4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmFinancialInstrumentIdentification
	 * SecurityCSDLink2.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink4, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageAttribute<SecurityCSDLink4, SecurityIdentification19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(SecurityCSDLink4 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, SecurityIdentification19 value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrInvstrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmIssuerInvestorCSD
	 * SecurityCSDLink2.mmIssuerInvestorCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink4, IssuerOrInvestor1Choice> mmIssuerInvestorCSD = new MMMessageAttribute<SecurityCSDLink4, IssuerOrInvestor1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "IssrInvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInvestorCSD";
			definition = "CSD Issuer of a security.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmIssuerInvestorCSD;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerOrInvestor1Choice.mmObject();
		}

		@Override
		public IssuerOrInvestor1Choice getValue(SecurityCSDLink4 obj) {
			return obj.getIssuerInvestorCSD();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, IssuerOrInvestor1Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechIssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmTechnicalIssuerCSD
	 * SecurityCSDLink2.mmTechnicalIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink4, Optional<SystemPartyIdentification1Choice>> mmTechnicalIssuerCSD = new MMMessageAssociationEnd<SecurityCSDLink4, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmTechnicalIssuerCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecurityCSDLink4 obj) {
			return obj.getTechnicalIssuerCSD();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, Optional<SystemPartyIdentification1Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyMntnc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityMaintenance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmSecurityMaintenance
	 * SecurityCSDLink2.mmSecurityMaintenance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink4, YesNoIndicator> mmSecurityMaintenance = new MMMessageAttribute<SecurityCSDLink4, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "SctyMntnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityMaintenance";
			definition = "Specifies if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.\r\n";
			previousVersion_lazy = () -> SecurityCSDLink2.mmSecurityMaintenance;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SecurityCSDLink4 obj) {
			return obj.getSecurityMaintenance();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, YesNoIndicator value) {
			obj.setSecurityMaintenance(value);
		}
	};
	@XmlElement(name = "IssncAcct")
	protected List<IssuanceAccount2> issuanceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IssuanceAccount2
	 * IssuanceAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmIssuanceAccount
	 * SecurityCSDLink2.mmIssuanceAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityCSDLink4, List<IssuanceAccount2>> mmIssuanceAccount = new MMMessageAssociationEnd<SecurityCSDLink4, List<IssuanceAccount2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmIssuanceAccount;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IssuanceAccount2.mmObject();
		}

		@Override
		public List<IssuanceAccount2> getValue(SecurityCSDLink4 obj) {
			return obj.getIssuanceAccount();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, List<IssuanceAccount2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date since when the CSD is linked to the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmValidFrom
	 * SecurityCSDLink2.mmValidFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink4, DateAndDateTimeChoice> mmValidFrom = new MMMessageAttribute<SecurityCSDLink4, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Defines the date since when the CSD is linked to the security.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmValidFrom;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(SecurityCSDLink4 obj) {
			return obj.getValidFrom();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, DateAndDateTimeChoice value) {
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink4
	 * SecurityCSDLink4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date until when the CSD is linked to the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2#mmValidTo
	 * SecurityCSDLink2.mmValidTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityCSDLink4, Optional<DateAndDateTimeChoice>> mmValidTo = new MMMessageAttribute<SecurityCSDLink4, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityCSDLink4.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Defines the date until when the CSD is linked to the security.";
			previousVersion_lazy = () -> SecurityCSDLink2.mmValidTo;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(SecurityCSDLink4 obj) {
			return obj.getValidTo();
		}

		@Override
		public void setValue(SecurityCSDLink4 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setValidTo(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityCSDLink4.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecurityCSDLink4.mmIssuerInvestorCSD,
						com.tools20022.repository.msg.SecurityCSDLink4.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecurityCSDLink4.mmSecurityMaintenance, com.tools20022.repository.msg.SecurityCSDLink4.mmIssuanceAccount,
						com.tools20022.repository.msg.SecurityCSDLink4.mmValidFrom, com.tools20022.repository.msg.SecurityCSDLink4.mmValidTo);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCSDLink4";
				definition = "Defines how the CSD is linked to the security.";
				previousVersion_lazy = () -> SecurityCSDLink2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecurityCSDLink4 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public IssuerOrInvestor1Choice getIssuerInvestorCSD() {
		return issuerInvestorCSD;
	}

	public SecurityCSDLink4 setIssuerInvestorCSD(IssuerOrInvestor1Choice issuerInvestorCSD) {
		this.issuerInvestorCSD = Objects.requireNonNull(issuerInvestorCSD);
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getTechnicalIssuerCSD() {
		return technicalIssuerCSD == null ? Optional.empty() : Optional.of(technicalIssuerCSD);
	}

	public SecurityCSDLink4 setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
		return this;
	}

	public YesNoIndicator getSecurityMaintenance() {
		return securityMaintenance;
	}

	public SecurityCSDLink4 setSecurityMaintenance(YesNoIndicator securityMaintenance) {
		this.securityMaintenance = Objects.requireNonNull(securityMaintenance);
		return this;
	}

	public List<IssuanceAccount2> getIssuanceAccount() {
		return issuanceAccount == null ? issuanceAccount = new ArrayList<>() : issuanceAccount;
	}

	public SecurityCSDLink4 setIssuanceAccount(List<IssuanceAccount2> issuanceAccount) {
		this.issuanceAccount = Objects.requireNonNull(issuanceAccount);
		return this;
	}

	public DateAndDateTimeChoice getValidFrom() {
		return validFrom;
	}

	public SecurityCSDLink4 setValidFrom(DateAndDateTimeChoice validFrom) {
		this.validFrom = Objects.requireNonNull(validFrom);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getValidTo() {
		return validTo == null ? Optional.empty() : Optional.of(validTo);
	}

	public SecurityCSDLink4 setValidTo(DateAndDateTimeChoice validTo) {
		this.validTo = validTo;
		return this;
	}
}