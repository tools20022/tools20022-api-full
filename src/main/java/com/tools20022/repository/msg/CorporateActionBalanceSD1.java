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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedQuantityFormat4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action balance details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmPlaceAndName
 * CorporateActionBalanceSD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmOriginalBalance
 * CorporateActionBalanceSD1.mmOriginalBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmAdjustedBalance
 * CorporateActionBalanceSD1.mmAdjustedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmUnpledgedBalance
 * CorporateActionBalanceSD1.mmUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmInvestmentUnpledgedBalance
 * CorporateActionBalanceSD1.mmInvestmentUnpledgedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1#mmInvestmentPledgedBalance
 * CorporateActionBalanceSD1.mmInvestmentPledgedBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionBalanceSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action balance details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3
 * CorporateActionBalanceSD3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionBalanceSD1", propOrder = {"placeAndName", "originalBalance", "adjustedBalance", "unpledgedBalance", "investmentUnpledgedBalance", "investmentPledgedBalance"})
public class CorporateActionBalanceSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmPlaceAndName
	 * CorporateActionBalanceSD3.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionBalanceSD1, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionBalanceSD1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionBalanceSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "OrgnlBal")
	protected SignedQuantityFormat4 originalBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmOriginalBalance
	 * CorporateActionBalanceSD3.mmOriginalBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>> mmOriginalBalance = new MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalBalance";
			definition = "Position held in a security as of the day prior to publication date. This position is subject to a redemption lottery call when this is the first lottery. This balance will not be adjusted for the supplemental or concurrent lotteries and will remain constant to report the original position.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmOriginalBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat4> getValue(CorporateActionBalanceSD1 obj) {
			return obj.getOriginalBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Optional<SignedQuantityFormat4> value) {
			obj.setOriginalBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjstdBal")
	protected SignedQuantityFormat4 adjustedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjusted position held in a security that is subject to redemption call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmAdjustedBalance
	 * CorporateActionBalanceSD3.mmAdjustedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>> mmAdjustedBalance = new MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "AdjstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedBalance";
			definition = "Adjusted position held in a security that is subject to redemption call.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmAdjustedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat4> getValue(CorporateActionBalanceSD1 obj) {
			return obj.getAdjustedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Optional<SignedQuantityFormat4> value) {
			obj.setAdjustedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "UpldgdBal")
	protected SignedQuantityFormat4 unpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmUnpledgedBalance
	 * CorporateActionBalanceSD3.mmUnpledgedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>> mmUnpledgedBalance = new MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "UpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC General Free account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmUnpledgedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat4> getValue(CorporateActionBalanceSD1 obj) {
			return obj.getUnpledgedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Optional<SignedQuantityFormat4> value) {
			obj.setUnpledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtUpldgdBal")
	protected SignedQuantityFormat4 investmentUnpledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtUpldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentUnpledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmInvestmentUnpledgedBalance
	 * CorporateActionBalanceSD3.mmInvestmentUnpledgedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>> mmInvestmentUnpledgedBalance = new MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtUpldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentUnpledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Segregated account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmInvestmentUnpledgedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat4> getValue(CorporateActionBalanceSD1 obj) {
			return obj.getInvestmentUnpledgedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Optional<SignedQuantityFormat4> value) {
			obj.setInvestmentUnpledgedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtPldgdBal")
	protected SignedQuantityFormat4 investmentPledgedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedQuantityFormat4
	 * SignedQuantityFormat4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD1
	 * CorporateActionBalanceSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtPldgdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPledgedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceSD3#mmInvestmentPledgedBalance
	 * CorporateActionBalanceSD3.mmInvestmentPledgedBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>> mmInvestmentPledgedBalance = new MMMessageAssociationEnd<CorporateActionBalanceSD1, Optional<SignedQuantityFormat4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionBalanceSD1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtPldgdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentPledgedBalance";
			definition = "Portion of the Original Balance position held in DTC Investment account as of day prior to Publication Date. Position held in this account is subject to redemption lottery call and must be released to allow allocation.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmInvestmentPledgedBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedQuantityFormat4.mmObject();
		}

		@Override
		public Optional<SignedQuantityFormat4> getValue(CorporateActionBalanceSD1 obj) {
			return obj.getInvestmentPledgedBalance();
		}

		@Override
		public void setValue(CorporateActionBalanceSD1 obj, Optional<SignedQuantityFormat4> value) {
			obj.setInvestmentPledgedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceSD1.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionBalanceSD1.mmOriginalBalance,
						com.tools20022.repository.msg.CorporateActionBalanceSD1.mmAdjustedBalance, com.tools20022.repository.msg.CorporateActionBalanceSD1.mmUnpledgedBalance,
						com.tools20022.repository.msg.CorporateActionBalanceSD1.mmInvestmentUnpledgedBalance, com.tools20022.repository.msg.CorporateActionBalanceSD1.mmInvestmentPledgedBalance);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionBalanceSD1";
				definition = "Provides additional information regarding corporate action balance details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionBalanceSD3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionBalanceSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<SignedQuantityFormat4> getOriginalBalance() {
		return originalBalance == null ? Optional.empty() : Optional.of(originalBalance);
	}

	public CorporateActionBalanceSD1 setOriginalBalance(SignedQuantityFormat4 originalBalance) {
		this.originalBalance = originalBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getAdjustedBalance() {
		return adjustedBalance == null ? Optional.empty() : Optional.of(adjustedBalance);
	}

	public CorporateActionBalanceSD1 setAdjustedBalance(SignedQuantityFormat4 adjustedBalance) {
		this.adjustedBalance = adjustedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getUnpledgedBalance() {
		return unpledgedBalance == null ? Optional.empty() : Optional.of(unpledgedBalance);
	}

	public CorporateActionBalanceSD1 setUnpledgedBalance(SignedQuantityFormat4 unpledgedBalance) {
		this.unpledgedBalance = unpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getInvestmentUnpledgedBalance() {
		return investmentUnpledgedBalance == null ? Optional.empty() : Optional.of(investmentUnpledgedBalance);
	}

	public CorporateActionBalanceSD1 setInvestmentUnpledgedBalance(SignedQuantityFormat4 investmentUnpledgedBalance) {
		this.investmentUnpledgedBalance = investmentUnpledgedBalance;
		return this;
	}

	public Optional<SignedQuantityFormat4> getInvestmentPledgedBalance() {
		return investmentPledgedBalance == null ? Optional.empty() : Optional.of(investmentPledgedBalance);
	}

	public CorporateActionBalanceSD1 setInvestmentPledgedBalance(SignedQuantityFormat4 investmentPledgedBalance) {
		this.investmentPledgedBalance = investmentPledgedBalance;
		return this;
	}
}