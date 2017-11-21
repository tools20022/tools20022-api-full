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
import com.tools20022.repository.choice.IssuerOrInvestor1choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityCSDLink2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityCSDLink2", propOrder = {"financialInstrumentIdentification", "issuerInvestorCSD", "technicalIssuerCSD", "securityMaintenance", "issuanceAccount", "validFrom", "validTo"})
public class SecurityCSDLink2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Identification of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	protected IssuerOrInvestor1choice issuerInvestorCSD;
	/**
	 * CSD Issuer of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.IssuerOrInvestor1choice
	 * IssuerOrInvestor1choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink2
	 * SecurityCSDLink2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerInvestorCSD = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "IssrInvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInvestorCSD";
			definition = "CSD Issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerOrInvestor1choice.mmObject();
		}
	};
	protected SystemPartyIdentification1Choice technicalIssuerCSD;
	/**
	 * Technical issuer of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTechnicalIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	protected YesNoIndicator securityMaintenance;
	/**
	 * Specifies if the involved CSD (issuer/technical issuer/investor) is also
	 * the maintainer of related reference data.<br>
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityMaintenance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "SctyMntnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityMaintenance";
			definition = "Specifies if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.IssuanceAccount1> issuanceAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuanceAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IssuanceAccount1.mmObject();
		}
	};
	protected DateAndDateTimeChoice validFrom;
	/**
	 * Defines the date since when the CSD is linked to the security.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "VldFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidFrom";
			definition = "Defines the date since when the CSD is linked to the security.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice validTo;
	/**
	 * Defines the date until when the CSD is linked to the security.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidTo = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink2.mmObject();
			isDerived = false;
			xmlTag = "VldTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidTo";
			definition = "Defines the date until when the CSD is linked to the security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityCSDLink2.mmFinancialInstrumentIdentification, SecurityCSDLink2.mmIssuerInvestorCSD, SecurityCSDLink2.mmTechnicalIssuerCSD, SecurityCSDLink2.mmSecurityMaintenance,
						SecurityCSDLink2.mmIssuanceAccount, SecurityCSDLink2.mmValidFrom, SecurityCSDLink2.mmValidTo);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCSDLink2";
				definition = "Defines how the CSD is linked to the security.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "IssrInvstrCSD", required = true)
	public IssuerOrInvestor1choice getIssuerInvestorCSD() {
		return issuerInvestorCSD;
	}

	public void setIssuerInvestorCSD(IssuerOrInvestor1choice issuerInvestorCSD) {
		this.issuerInvestorCSD = issuerInvestorCSD;
	}

	@XmlElement(name = "TechIssrCSD")
	public SystemPartyIdentification1Choice getTechnicalIssuerCSD() {
		return technicalIssuerCSD;
	}

	public void setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
	}

	@XmlElement(name = "SctyMntnc", required = true)
	public YesNoIndicator getSecurityMaintenance() {
		return securityMaintenance;
	}

	public void setSecurityMaintenance(YesNoIndicator securityMaintenance) {
		this.securityMaintenance = securityMaintenance;
	}

	@XmlElement(name = "IssncAcct")
	public List<IssuanceAccount1> getIssuanceAccount() {
		return issuanceAccount;
	}

	public void setIssuanceAccount(List<com.tools20022.repository.msg.IssuanceAccount1> issuanceAccount) {
		this.issuanceAccount = issuanceAccount;
	}

	@XmlElement(name = "VldFr", required = true)
	public DateAndDateTimeChoice getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(DateAndDateTimeChoice validFrom) {
		this.validFrom = validFrom;
	}

	@XmlElement(name = "VldTo")
	public DateAndDateTimeChoice getValidTo() {
		return validTo;
	}

	public void setValidTo(DateAndDateTimeChoice validTo) {
		this.validTo = validTo;
	}
}