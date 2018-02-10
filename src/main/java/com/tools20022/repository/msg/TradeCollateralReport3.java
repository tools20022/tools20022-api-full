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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CollateralisationType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount;
import com.tools20022.repository.datatype.Max52Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of collateral agreement between counterparties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmCollateralisation
 * TradeCollateralReport3.mmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmPortfolio
 * TradeCollateralReport3.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmInitialMarginPosted
 * TradeCollateralReport3.mmInitialMarginPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmVariationMarginPosted
 * TradeCollateralReport3.mmVariationMarginPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmInitialMarginReceived
 * TradeCollateralReport3.mmInitialMarginReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmVariationMarginReceived
 * TradeCollateralReport3.mmVariationMarginReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmExcessCollateralPosted
 * TradeCollateralReport3.mmExcessCollateralPosted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3#mmExcessCollateralReceived
 * TradeCollateralReport3.mmExcessCollateralReceived}</li>
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
 * "TradeCollateralReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of collateral agreement between counterparties."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeCollateralReport3", propOrder = {"collateralisation", "portfolio", "initialMarginPosted", "variationMarginPosted", "initialMarginReceived", "variationMarginReceived", "excessCollateralPosted",
		"excessCollateralReceived"})
public class TradeCollateralReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Collstn")
	protected CollateralisationType1Code collateralisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationType1Code
	 * CollateralisationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Collstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information indicating the type of collateral agreement existing between counterparties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralisation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "Collstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateralisation";
			definition = "Information indicating the type of collateral agreement existing between counterparties.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CollateralisationType1Code.mmObject();
		}
	};
	@XmlElement(name = "Prtfl")
	protected Max52Text portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max52Text
	 * Max52Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A unique code determined by the reporting counterparty to identify the portfolio if collateral is reported on a portfolio basis."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolio = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "A unique code determined by the reporting counterparty to identify the portfolio if collateral is reported on a portfolio basis.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max52Text.mmObject();
		}
	};
	@XmlElement(name = "InitlMrgnPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount initialMarginPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnPstd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the initial margin posted by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where initial margin is posted on a portfolio basis, this field should include the overall value of initial margin posted for the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitialMarginPosted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginPosted";
			definition = "Value of the initial margin posted by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where initial margin is posted on a portfolio basis, this field should include the overall value of initial margin posted for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};
	@XmlElement(name = "VartnMrgnPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount variationMarginPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnPstd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the variation margin posted, including cash settled, by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where variation margin is posted on a portfolio basis, this field should include the overall value of variation margin posted for the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariationMarginPosted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginPosted";
			definition = "Value of the variation margin posted, including cash settled, by the reporting counterparty to the other counterparty. \r\n\r\nUsage: Where variation margin is posted on a portfolio basis, this field should include the overall value of variation margin posted for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};
	@XmlElement(name = "InitlMrgnRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount initialMarginReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgnRcvd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMarginReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the initial margin received by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where initial margin is received on a portfolio basis, this field should include the overall value of initial margin received for the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitialMarginReceived = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgnRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMarginReceived";
			definition = "Value of the initial margin received by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where initial margin is received on a portfolio basis, this field should include the overall value of initial margin received for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};
	@XmlElement(name = "VartnMrgnRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount variationMarginReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgnRcvd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the variation margin received, including cash settled, by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where variation margin is received on a portfolio basis, this field should include the overall value of variation margin received for the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVariationMarginReceived = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgnRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginReceived";
			definition = "Value of the variation margin received, including cash settled, by the reporting counterparty from the other counterparty. \r\n\r\nUsage: Where variation margin is received on a portfolio basis, this field should include the overall value of variation margin received for the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};
	@XmlElement(name = "XcssCollPstd")
	protected ActiveOrHistoricCurrencyAnd20Amount excessCollateralPosted;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcssCollPstd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessCollateralPosted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of collateral posted in excess of the required collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExcessCollateralPosted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "XcssCollPstd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessCollateralPosted";
			definition = "Value of collateral posted in excess of the required collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};
	@XmlElement(name = "XcssCollRcvd")
	protected ActiveOrHistoricCurrencyAnd20Amount excessCollateralReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd20Amount
	 * ActiveOrHistoricCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeCollateralReport3
	 * TradeCollateralReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcssCollRcvd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessCollateralReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of collateral received in excess of the required collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExcessCollateralReceived = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeCollateralReport3.mmObject();
			isDerived = false;
			xmlTag = "XcssCollRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExcessCollateralReceived";
			definition = "Value of collateral received in excess of the required collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd20Amount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeCollateralReport3.mmCollateralisation, com.tools20022.repository.msg.TradeCollateralReport3.mmPortfolio,
						com.tools20022.repository.msg.TradeCollateralReport3.mmInitialMarginPosted, com.tools20022.repository.msg.TradeCollateralReport3.mmVariationMarginPosted,
						com.tools20022.repository.msg.TradeCollateralReport3.mmInitialMarginReceived, com.tools20022.repository.msg.TradeCollateralReport3.mmVariationMarginReceived,
						com.tools20022.repository.msg.TradeCollateralReport3.mmExcessCollateralPosted, com.tools20022.repository.msg.TradeCollateralReport3.mmExcessCollateralReceived);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeCollateralReport3";
				definition = "Details of collateral agreement between counterparties.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CollateralisationType1Code> getCollateralisation() {
		return collateralisation == null ? Optional.empty() : Optional.of(collateralisation);
	}

	public TradeCollateralReport3 setCollateralisation(CollateralisationType1Code collateralisation) {
		this.collateralisation = collateralisation;
		return this;
	}

	public Optional<Max52Text> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public TradeCollateralReport3 setPortfolio(Max52Text portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getInitialMarginPosted() {
		return initialMarginPosted == null ? Optional.empty() : Optional.of(initialMarginPosted);
	}

	public TradeCollateralReport3 setInitialMarginPosted(ActiveOrHistoricCurrencyAnd20Amount initialMarginPosted) {
		this.initialMarginPosted = initialMarginPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getVariationMarginPosted() {
		return variationMarginPosted == null ? Optional.empty() : Optional.of(variationMarginPosted);
	}

	public TradeCollateralReport3 setVariationMarginPosted(ActiveOrHistoricCurrencyAnd20Amount variationMarginPosted) {
		this.variationMarginPosted = variationMarginPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getInitialMarginReceived() {
		return initialMarginReceived == null ? Optional.empty() : Optional.of(initialMarginReceived);
	}

	public TradeCollateralReport3 setInitialMarginReceived(ActiveOrHistoricCurrencyAnd20Amount initialMarginReceived) {
		this.initialMarginReceived = initialMarginReceived;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getVariationMarginReceived() {
		return variationMarginReceived == null ? Optional.empty() : Optional.of(variationMarginReceived);
	}

	public TradeCollateralReport3 setVariationMarginReceived(ActiveOrHistoricCurrencyAnd20Amount variationMarginReceived) {
		this.variationMarginReceived = variationMarginReceived;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getExcessCollateralPosted() {
		return excessCollateralPosted == null ? Optional.empty() : Optional.of(excessCollateralPosted);
	}

	public TradeCollateralReport3 setExcessCollateralPosted(ActiveOrHistoricCurrencyAnd20Amount excessCollateralPosted) {
		this.excessCollateralPosted = excessCollateralPosted;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd20Amount> getExcessCollateralReceived() {
		return excessCollateralReceived == null ? Optional.empty() : Optional.of(excessCollateralReceived);
	}

	public TradeCollateralReport3 setExcessCollateralReceived(ActiveOrHistoricCurrencyAnd20Amount excessCollateralReceived) {
		this.excessCollateralReceived = excessCollateralReceived;
		return this;
	}
}