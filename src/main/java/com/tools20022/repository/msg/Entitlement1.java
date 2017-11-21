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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the entitlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmAccountOwnerIdentification
 * Entitlement1.mmAccountOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmAccountIdentification
 * Entitlement1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmSecuritiesDistributionDetails
 * Entitlement1.mmSecuritiesDistributionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Entitlement1#mmCashDistributionDetails
 * Entitlement1.mmCashDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
 * CorporateActionEntitlement}</li>
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
 * "Entitlement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the entitlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Entitlement1", propOrder = {"accountOwnerIdentification", "accountIdentification", "securitiesDistributionDetails", "cashDistributionDetails"})
public class Entitlement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification2Choice accountOwnerIdentification;
	/**
	 * Identification of the party that owns the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party that owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Entitlement1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerIdentification";
			definition = "Identification of the party that owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected Max35Text accountIdentification;
	/**
	 * Idenfitication of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
	 * AccountIdentification.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Idenfitication of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmNumber;
			componentContext_lazy = () -> Entitlement1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Idenfitication of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesEntitlement1> securitiesDistributionDetails;
	/**
	 * Provides information about the securities distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesEntitlement1
	 * SecuritiesEntitlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
	 * CorporateActionSecuritiesEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the securities distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesDistributionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmObject();
			componentContext_lazy = () -> Entitlement1.mmObject();
			isDerived = false;
			xmlTag = "SctiesDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesDistributionDetails";
			definition = "Provides information about the securities distribution.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesEntitlement1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashEntitlement1> cashDistributionDetails;
	/**
	 * Provides information about the cash distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashEntitlement1
	 * CashEntitlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the cash distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashDistributionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionCashEntitlement.mmObject();
			componentContext_lazy = () -> Entitlement1.mmObject();
			isDerived = false;
			xmlTag = "CshDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionDetails";
			definition = "Provides information about the cash distribution.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashEntitlement1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Entitlement1.mmAccountOwnerIdentification, Entitlement1.mmAccountIdentification, Entitlement1.mmSecuritiesDistributionDetails, Entitlement1.mmCashDistributionDetails);
				trace_lazy = () -> CorporateActionEntitlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Entitlement1";
				definition = "Provides information about the entitlement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctOwnrId")
	public PartyIdentification2Choice getAccountOwnerIdentification() {
		return accountOwnerIdentification;
	}

	public void setAccountOwnerIdentification(PartyIdentification2Choice accountOwnerIdentification) {
		this.accountOwnerIdentification = accountOwnerIdentification;
	}

	@XmlElement(name = "AcctId", required = true)
	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "SctiesDstrbtnDtls")
	public List<SecuritiesEntitlement1> getSecuritiesDistributionDetails() {
		return securitiesDistributionDetails;
	}

	public void setSecuritiesDistributionDetails(List<com.tools20022.repository.msg.SecuritiesEntitlement1> securitiesDistributionDetails) {
		this.securitiesDistributionDetails = securitiesDistributionDetails;
	}

	@XmlElement(name = "CshDstrbtnDtls")
	public List<CashEntitlement1> getCashDistributionDetails() {
		return cashDistributionDetails;
	}

	public void setCashDistributionDetails(List<com.tools20022.repository.msg.CashEntitlement1> cashDistributionDetails) {
		this.cashDistributionDetails = cashDistributionDetails;
	}
}