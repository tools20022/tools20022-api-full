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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Balance types related to an unallocated redemption payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmPlaceAndName
 * CorporateActionUnallocatedBalanceSD4.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmTotalEligibleBalance
 * CorporateActionUnallocatedBalanceSD4.mmTotalEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmPledgedBalance
 * CorporateActionUnallocatedBalanceSD4.mmPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmInvestmentPledgedBalance
 * CorporateActionUnallocatedBalanceSD4.mmInvestmentPledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmInvestmentUnpledgedBalance
 * CorporateActionUnallocatedBalanceSD4.mmInvestmentUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4#mmMemoSegregationBalance
 * CorporateActionUnallocatedBalanceSD4.mmMemoSegregationBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionUnallocatedBalanceSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Balance types related to an unallocated redemption payment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2
 * CorporateActionUnallocatedBalanceSD2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionUnallocatedBalanceSD4", propOrder = {"placeAndName", "totalEligibleBalance", "pledgedBalance", "investmentPledgedBalance", "investmentUnpledgedBalance", "memoSegregationBalance"})
public class CorporateActionUnallocatedBalanceSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Xpath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmPlaceAndName
	 * CorporateActionUnallocatedBalanceSD2.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD4, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD4, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Xpath to the element that is being extended.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlElgblBal")
	protected SignedQuantityFormat9 totalEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::ELIG, DTCCSynonym: Total
	 * Eligible Balance</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmTotalEligibleBalance
	 * CorporateActionUnallocatedBalanceSD2.mmTotalEligibleBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>> mmTotalEligibleBalance = new MMMessageAttribute<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::ELIG"), new DTCCSynonym(this, "Total Eligible Balance"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmTotalEligibleBalance;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getTotalEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<SignedQuantityFormat9> value) {
			obj.setTotalEligibleBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "PldgdBal")
	protected SignedQuantityFormat9 pledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account. This position is ineligible for payment until released from pledgee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmPledgedBalance
	 * CorporateActionUnallocatedBalanceSD2.mmPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>> mmPledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "PldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgedBalance";
			definition = "Position held in DTC Segregated account. This position is ineligible for payment until released from pledgee.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getPledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<SignedQuantityFormat9> value) {
			obj.setPledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat9 investmentPledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account also called account 18. This position is not eligible for instruction processing but will be eligible for payment on mandatory events."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmInvestmentPledgedBalance
	 * CorporateActionUnallocatedBalanceSD2.mmInvestmentPledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>> mmInvestmentPledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Position held in DTC Segregated account also called account 18. This position is not eligible for instruction processing but will be eligible for payment on mandatory events.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmInvestmentPledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getInvestmentPledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentPledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat9 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account also called account 22. This position is not eligible for instruction processing but will be eligible for payment on mandatory events. \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmInvestmentUnpledgedBalance
	 * CorporateActionUnallocatedBalanceSD2.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>> mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Position held in DTC Segregated account also called account 22. This position is not eligible for instruction processing but will be eligible for payment on mandatory events. \r\n";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmInvestmentUnpledgedBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getInvestmentUnpledgedBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<SignedQuantityFormat9> value) {
			obj.setInvestmentUnpledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "MemoSgrtnBal")
	protected SignedQuantityFormat9 memoSegregationBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat9
	 * SignedQuantityFormat9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4
	 * CorporateActionUnallocatedBalanceSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MemoSgrtnBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoSegregationBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in DTC Segregated account. This position is eligible for payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD2#mmMemoSegregationBalance
	 * CorporateActionUnallocatedBalanceSD2.mmMemoSegregationBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>> mmMemoSegregationBalance = new MMMessageAssociationEnd<CorporateActionUnallocatedBalanceSD4, Optional<SignedQuantityFormat9>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmObject();
			isDerived = false;
			xmlTag = "MemoSgrtnBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoSegregationBalance";
			definition = "Position held in DTC Segregated account. This position is eligible for payment.";
			previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmMemoSegregationBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat9.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat9> getValue(CorporateActionUnallocatedBalanceSD4 obj) {
			return obj.getMemoSegregationBalance();
		}

		@Override
		public void setValue(CorporateActionUnallocatedBalanceSD4 obj, Optional<SignedQuantityFormat9> value) {
			obj.setMemoSegregationBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmTotalEligibleBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmPledgedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmInvestmentPledgedBalance,
						com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmInvestmentUnpledgedBalance, com.tools20022.repository.msg.CorporateActionUnallocatedBalanceSD4.mmMemoSegregationBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionUnallocatedBalanceSD4";
				definition = "Balance types related to an unallocated redemption payment.";
				previousVersion_lazy = () -> CorporateActionUnallocatedBalanceSD2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public CorporateActionUnallocatedBalanceSD4 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<SignedQuantityFormat9> getTotalEligibleBalance() {
		return totalEligibleBalance == null ? Optional.empty() : Optional.of(totalEligibleBalance);
	}

	public CorporateActionUnallocatedBalanceSD4 setTotalEligibleBalance(SignedQuantityFormat9 totalEligibleBalance) {
		this.totalEligibleBalance = totalEligibleBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getPledgedBalance() {
		return pledgedBalance == null ? Optional.empty() : Optional.of(pledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD4 setPledgedBalance(SignedQuantityFormat9 pledgedBalance) {
		this.pledgedBalance = pledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD4 setInvestmentPledgedBalance(SignedQuantityFormat9 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public CorporateActionUnallocatedBalanceSD4 setInvestmentUnpledgedBalance(SignedQuantityFormat9 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat9> getMemoSegregationBalance() {
		return memoSegregationBalance == null ? Optional.empty() : Optional.of(memoSegregationBalance);
	}

	public CorporateActionUnallocatedBalanceSD4 setMemoSegregationBalance(SignedQuantityFormat9 memoSegregationBalance) {
		this.memoSegregationBalance = memoSegregationBalance;
		return this;
	}
}