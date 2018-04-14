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
import com.tools20022.repository.choice.DataFormat2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashInForecast5;
import com.tools20022.repository.msg.CashOutForecast5;
import com.tools20022.repository.msg.InvestmentAccount42;
import com.tools20022.repository.msg.NetCashForecast4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the cash-in and cash-out flows by a user defined parameter/s.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmParty
 * BreakdownByUserDefinedParameter3.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCountry
 * BreakdownByUserDefinedParameter3.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCurrency
 * BreakdownByUserDefinedParameter3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmUserDefined
 * BreakdownByUserDefinedParameter3.mmUserDefined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCashInForecast
 * BreakdownByUserDefinedParameter3.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmCashOutForecast
 * BreakdownByUserDefinedParameter3.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3#mmNetCashForecast
 * BreakdownByUserDefinedParameter3.mmNetCashForecast}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BreakdownByUserDefinedParameter3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the cash-in and cash-out flows by a user defined parameter/s."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUserDefinedRule#forBreakdownByUserDefinedParameter3
 * ConstraintUserDefinedRule.forBreakdownByUserDefinedParameter3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1
 * BreakdownByUserDefinedParameter1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakdownByUserDefinedParameter3", propOrder = {"party", "country", "currency", "userDefined", "cashInForecast", "cashOutForecast", "netCashForecast"})
public class BreakdownByUserDefinedParameter3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty")
	protected InvestmentAccount42 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42
	 * InvestmentAccount42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmParty
	 * BreakdownByUserDefinedParameter1.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<InvestmentAccount42>> mmParty = new MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<InvestmentAccount42>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Party for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmParty;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount42.mmObject();
		}

		@Override
		public Optional<InvestmentAccount42> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, Optional<InvestmentAccount42> value) {
			obj.setParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCountry
	 * BreakdownByUserDefinedParameter1.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<CountryCode>> mmCountry = new MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCurrency
	 * BreakdownByUserDefinedParameter1.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "UsrDfnd")
	protected DataFormat2Choice userDefined;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DataFormat2Choice
	 * DataFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrDfnd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserDefined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameter for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmUserDefined
	 * BreakdownByUserDefinedParameter1.mmUserDefined}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<DataFormat2Choice>> mmUserDefined = new MMMessageAttribute<BreakdownByUserDefinedParameter3, Optional<DataFormat2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "UsrDfnd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserDefined";
			definition = "Parameter for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmUserDefined;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DataFormat2Choice.mmObject();
		}

		@Override
		public Optional<DataFormat2Choice> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getUserDefined();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, Optional<DataFormat2Choice> value) {
			obj.setUserDefined(value.orElse(null));
		}
	};
	@XmlElement(name = "CshInFcst")
	protected List<CashInForecast5> cashInForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast5
	 * CashInForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCashInForecast
	 * BreakdownByUserDefinedParameter1.mmCashInForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<CashInForecast5>> mmCashInForecast = new MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<CashInForecast5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmCashInForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast5.mmObject();
		}

		@Override
		public List<CashInForecast5> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getCashInForecast();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, List<CashInForecast5> value) {
			obj.setCashInForecast(value);
		}
	};
	@XmlElement(name = "CshOutFcst")
	protected List<CashOutForecast5> cashOutForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmCashOutForecast
	 * BreakdownByUserDefinedParameter1.mmCashOutForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<CashOutForecast5>> mmCashOutForecast = new MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<CashOutForecast5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmCashOutForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast5.mmObject();
		}

		@Override
		public List<CashOutForecast5> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getCashOutForecast();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, List<CashOutForecast5> value) {
			obj.setCashOutForecast(value);
		}
	};
	@XmlElement(name = "NetCshFcst")
	protected List<NetCashForecast4> netCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified for the user defined parameter."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter1#mmNetCashForecast
	 * BreakdownByUserDefinedParameter1.mmNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<NetCashForecast4>> mmNetCashForecast = new MMMessageAssociationEnd<BreakdownByUserDefinedParameter3, List<NetCashForecast4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the user defined parameter.";
			previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmNetCashForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast4.mmObject();
		}

		@Override
		public List<NetCashForecast4> getValue(BreakdownByUserDefinedParameter3 obj) {
			return obj.getNetCashForecast();
		}

		@Override
		public void setValue(BreakdownByUserDefinedParameter3 obj, List<NetCashForecast4> value) {
			obj.setNetCashForecast(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmParty, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCountry,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCurrency, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmUserDefined,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCashInForecast, com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmCashOutForecast,
						com.tools20022.repository.msg.BreakdownByUserDefinedParameter3.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUserDefinedRule.forBreakdownByUserDefinedParameter3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByUserDefinedParameter3";
				definition = "Specifies the cash-in and cash-out flows by a user defined parameter/s.";
				previousVersion_lazy = () -> BreakdownByUserDefinedParameter1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount42> getParty() {
		return party == null ? Optional.empty() : Optional.of(party);
	}

	public BreakdownByUserDefinedParameter3 setParty(InvestmentAccount42 party) {
		this.party = party;
		return this;
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public BreakdownByUserDefinedParameter3 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public BreakdownByUserDefinedParameter3 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<DataFormat2Choice> getUserDefined() {
		return userDefined == null ? Optional.empty() : Optional.of(userDefined);
	}

	public BreakdownByUserDefinedParameter3 setUserDefined(DataFormat2Choice userDefined) {
		this.userDefined = userDefined;
		return this;
	}

	public List<CashInForecast5> getCashInForecast() {
		return cashInForecast == null ? cashInForecast = new ArrayList<>() : cashInForecast;
	}

	public BreakdownByUserDefinedParameter3 setCashInForecast(List<CashInForecast5> cashInForecast) {
		this.cashInForecast = Objects.requireNonNull(cashInForecast);
		return this;
	}

	public List<CashOutForecast5> getCashOutForecast() {
		return cashOutForecast == null ? cashOutForecast = new ArrayList<>() : cashOutForecast;
	}

	public BreakdownByUserDefinedParameter3 setCashOutForecast(List<CashOutForecast5> cashOutForecast) {
		this.cashOutForecast = Objects.requireNonNull(cashOutForecast);
		return this;
	}

	public List<NetCashForecast4> getNetCashForecast() {
		return netCashForecast == null ? netCashForecast = new ArrayList<>() : netCashForecast;
	}

	public BreakdownByUserDefinedParameter3 setNetCashForecast(List<NetCashForecast4> netCashForecast) {
		this.netCashForecast = Objects.requireNonNull(netCashForecast);
		return this;
	}
}