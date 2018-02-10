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

import com.tools20022.metamodel.ext.DTCCSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice;
import com.tools20022.repository.datatype.RestrictedFINXMax35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1#mmSafekeepingAccount
 * CorporateActionUnallocatedDetailsSD1.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1#mmUnallocatedBalance
 * CorporateActionUnallocatedDetailsSD1.mmUnallocatedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1#mmUnallocatedSecuritiesTransactionDetails
 * CorporateActionUnallocatedDetailsSD1.
 * mmUnallocatedSecuritiesTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1#mmUnallocatedCashTransactionDetails
 * CorporateActionUnallocatedDetailsSD1.mmUnallocatedCashTransactionDetails}</li>
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
 * "CorporateActionUnallocatedDetailsSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD2
 * CorporateActionUnallocatedDetailsSD2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedDetailsSD1", propOrder = {"safekeepingAccount", "unallocatedBalance", "unallocatedSecuritiesTransactionDetails", "unallocatedCashTransactionDetails"})
public class CorporateActionUnallocatedDetailsSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SfkpgAcct", required = true)
	protected RestrictedFINXMax35Text safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax35Text
	 * RestrictedFINXMax35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1
	 * CorporateActionUnallocatedDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::SAFE, DTCCSynonym: Participant
	 * Number</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account where financial instruments are maintained."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformationSD16#mmSafekeepingAccount
	 * CorporateActionGeneralInformationSD16.mmSafekeepingAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::SAFE"), new DTCCSynonym(this, "Participant Number"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account where financial instruments are maintained.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionGeneralInformationSD16.mmSafekeepingAccount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax35Text.mmObject();
		}
	};
	@XmlElement(name = "UallctdBal")
	protected CorporateActionUnallocatedBalanceSD1Choice unallocatedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionUnallocatedBalanceSD1Choice
	 * CorporateActionUnallocatedBalanceSD1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1
	 * CorporateActionUnallocatedDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Unallocated Balance</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Participants positions balance concerned in unallocated payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD2#mmUnallocatedBalance
	 * CorporateActionUnallocatedDetailsSD2.mmUnallocatedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "UallctdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Unallocated Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedBalance";
			definition = "Type of Participants positions balance concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD2.mmUnallocatedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionUnallocatedBalanceSD1Choice.mmObject();
		}
	};
	@XmlElement(name = "UallctdSctiesTxDtls")
	protected List<com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD1> unallocatedSecuritiesTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD1
	 * CorporateActionUnallocatedSecuritiesTransactionDetailsSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1
	 * CorporateActionUnallocatedDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdSctiesTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout (Cash)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedSecuritiesTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the securities transactions concerned in unallocated payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD2#mmUnallocatedSecuritiesTransactionDetails
	 * CorporateActionUnallocatedDetailsSD2.
	 * mmUnallocatedSecuritiesTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedSecuritiesTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "UallctdSctiesTxDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout (Cash)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedSecuritiesTransactionDetails";
			definition = "Details of the securities transactions concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD2.mmUnallocatedSecuritiesTransactionDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD1.mmObject();
		}
	};
	@XmlElement(name = "UallctdCshTxDtls")
	protected List<com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1> unallocatedCashTransactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1
	 * CorporateActionUnallocatedCashTransactionDetailsSD1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1
	 * CorporateActionUnallocatedDetailsSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UallctdCshTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = DTCCSynonym: Payout (Securities)</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnallocatedCashTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the cash transactions concerned in unallocated payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD2#mmUnallocatedCashTransactionDetails
	 * CorporateActionUnallocatedDetailsSD2.mmUnallocatedCashTransactionDetails}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnallocatedCashTransactionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmObject();
			isDerived = false;
			xmlTag = "UallctdCshTxDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new DTCCSynonym(this, "Payout (Securities)"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnallocatedCashTransactionDetails";
			definition = "Details of the cash transactions concerned in unallocated payment.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD2.mmUnallocatedCashTransactionDetails);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmSafekeepingAccount, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmUnallocatedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmUnallocatedSecuritiesTransactionDetails, com.tools20022.repository.msg.CorporateActionUnallocatedDetailsSD1.mmUnallocatedCashTransactionDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionUnallocatedDetailsSD1";
				definition = "Provides additional information regarding the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionUnallocatedDetailsSD2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedFINXMax35Text getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public CorporateActionUnallocatedDetailsSD1 setSafekeepingAccount(RestrictedFINXMax35Text safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public Optional<CorporateActionUnallocatedBalanceSD1Choice> getUnallocatedBalance() {
		return unallocatedBalance == null ? Optional.empty() : Optional.of(unallocatedBalance);
	}

	public CorporateActionUnallocatedDetailsSD1 setUnallocatedBalance(CorporateActionUnallocatedBalanceSD1Choice unallocatedBalance) {
		this.unallocatedBalance = unallocatedBalance;
		return this;
	}

	public List<CorporateActionUnallocatedSecuritiesTransactionDetailsSD1> getUnallocatedSecuritiesTransactionDetails() {
		return unallocatedSecuritiesTransactionDetails == null ? unallocatedSecuritiesTransactionDetails = new ArrayList<>() : unallocatedSecuritiesTransactionDetails;
	}

	public CorporateActionUnallocatedDetailsSD1 setUnallocatedSecuritiesTransactionDetails(List<com.tools20022.repository.msg.CorporateActionUnallocatedSecuritiesTransactionDetailsSD1> unallocatedSecuritiesTransactionDetails) {
		this.unallocatedSecuritiesTransactionDetails = Objects.requireNonNull(unallocatedSecuritiesTransactionDetails);
		return this;
	}

	public List<CorporateActionUnallocatedCashTransactionDetailsSD1> getUnallocatedCashTransactionDetails() {
		return unallocatedCashTransactionDetails == null ? unallocatedCashTransactionDetails = new ArrayList<>() : unallocatedCashTransactionDetails;
	}

	public CorporateActionUnallocatedDetailsSD1 setUnallocatedCashTransactionDetails(List<com.tools20022.repository.msg.CorporateActionUnallocatedCashTransactionDetailsSD1> unallocatedCashTransactionDetails) {
		this.unallocatedCashTransactionDetails = Objects.requireNonNull(unallocatedCashTransactionDetails);
		return this;
	}
}