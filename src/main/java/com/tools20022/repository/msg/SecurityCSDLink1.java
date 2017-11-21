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
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmValidFrom
 * SecurityCSDLink1.mmValidFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmValidTo
 * SecurityCSDLink1.mmValidTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmSecurityMaintenance
 * SecurityCSDLink1.mmSecurityMaintenance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmIssuerCSD
 * SecurityCSDLink1.mmIssuerCSD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmInvestorCSD
 * SecurityCSDLink1.mmInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmTechnicalIssuerCSD
 * SecurityCSDLink1.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1#mmIssuanceAccount
 * SecurityCSDLink1.mmIssuanceAccount}</li>
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
 * "SecurityCSDLink1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines how the CSD is linked to the security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityCSDLink1", propOrder = {"validFrom", "validTo", "securityMaintenance", "issuerCSD", "investorCSD", "technicalIssuerCSD", "issuanceAccount"})
public class SecurityCSDLink1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
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
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
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
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
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
	protected YesNoIndicator securityMaintenance;
	/**
	 * Specify if the involved CSD (issuer/technical issuer/investor) is also
	 * the maintainer of related reference data.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
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
	 * "Specify if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityMaintenance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
			isDerived = false;
			xmlTag = "SctyMntnc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityMaintenance";
			definition = "Specify if the involved CSD (issuer/technical issuer/investor) is also the maintainer of related reference data.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SystemPartyIdentification1Choice issuerCSD;
	/**
	 * CSD Issuer of a security.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "CSD Issuer of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};
	protected SystemPartyIdentification1Choice investorCSD;
	/**
	 * CSD Investor of a security.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Investor of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "CSD Investor of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
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
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
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
	protected List<com.tools20022.repository.msg.IssuanceAccount1> issuanceAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount1
	 * IssuanceAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityCSDLink1
	 * SecurityCSDLink1}</li>
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
	public static final MMMessageAttribute mmIssuanceAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityCSDLink1.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IssuanceAccount1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityCSDLink1.mmValidFrom, SecurityCSDLink1.mmValidTo, SecurityCSDLink1.mmSecurityMaintenance, SecurityCSDLink1.mmIssuerCSD, SecurityCSDLink1.mmInvestorCSD,
						SecurityCSDLink1.mmTechnicalIssuerCSD, SecurityCSDLink1.mmIssuanceAccount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityCSDLink1";
				definition = "Defines how the CSD is linked to the security.";
			}
		});
		return mmObject_lazy.get();
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

	@XmlElement(name = "SctyMntnc")
	public YesNoIndicator getSecurityMaintenance() {
		return securityMaintenance;
	}

	public void setSecurityMaintenance(YesNoIndicator securityMaintenance) {
		this.securityMaintenance = securityMaintenance;
	}

	@XmlElement(name = "IssrCSD")
	public SystemPartyIdentification1Choice getIssuerCSD() {
		return issuerCSD;
	}

	public void setIssuerCSD(SystemPartyIdentification1Choice issuerCSD) {
		this.issuerCSD = issuerCSD;
	}

	@XmlElement(name = "InvstrCSD")
	public SystemPartyIdentification1Choice getInvestorCSD() {
		return investorCSD;
	}

	public void setInvestorCSD(SystemPartyIdentification1Choice investorCSD) {
		this.investorCSD = investorCSD;
	}

	@XmlElement(name = "TechIssrCSD")
	public SystemPartyIdentification1Choice getTechnicalIssuerCSD() {
		return technicalIssuerCSD;
	}

	public void setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
	}

	@XmlElement(name = "IssncAcct")
	public List<IssuanceAccount1> getIssuanceAccount() {
		return issuanceAccount;
	}

	public void setIssuanceAccount(List<com.tools20022.repository.msg.IssuanceAccount1> issuanceAccount) {
		this.issuanceAccount = issuanceAccount;
	}
}