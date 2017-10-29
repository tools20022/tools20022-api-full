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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Alternative identification of a financial instrument other than an
 * identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Equity
 * FinancialInstrumentProperties1Choice.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Debt
 * FinancialInstrumentProperties1Choice.Debt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Option
 * FinancialInstrumentProperties1Choice.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Warrant
 * FinancialInstrumentProperties1Choice.Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#Future
 * FinancialInstrumentProperties1Choice.Future}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
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
 * "FinancialInstrumentProperties1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Alternative identification of a financial instrument other than an identifier."
 * </li>
 * </ul>
 */
public class FinancialInstrumentProperties1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Financial instrument which represents a title of ownership in a company,
	 * ie, the shareholder is entitled to a part of the company's profit -
	 * usually by payment of a dividend - and to voting rights, if any. Each
	 * company issues generally different classes of shares, eg, ordinary or
	 * common shares, which have no guaranteed amount of dividend but carry
	 * voting rights, or preferred shares, which receive dividends before
	 * ordinary shares but have no voting right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equity1 Equity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity Equity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Eqty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument which represents a title of ownership  in a company, ie,  the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Equity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Equity.mmObject();
			isDerived = false;
			xmlTag = "Eqty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Financial instrument which represents a title of ownership  in a company, ie,  the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Equity1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Any interest-bearing or discounted government or corporate security that
	 * obligates the issuer to pay the bondholder a specified sum of money,
	 * usually at specific intervals, and to repay the principal amount of the
	 * loan at the maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Debt1 Debt1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Debt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any interest-bearing or discounted government or corporate security that obligates the issuer to pay the bondholder a specified sum of money, usually at specific intervals, and to repay the principal amount of the loan at the maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Debt = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Debt.mmObject();
			isDerived = false;
			xmlTag = "Debt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debt";
			definition = "Any interest-bearing or discounted government or corporate security that obligates the issuer to pay the bondholder a specified sum of money, usually at specific intervals, and to repay the principal amount of the loan at the maturity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Debt1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Right to buy (call) or sell (put) an underlying asset (securities, index,
	 * commodities, etc) at the predetermined price within a specified period of
	 * time
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Option1 Option1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Right to buy (call) or sell (put) an underlying asset (securities, index, commodities, etc) at the predetermined price within a specified period of time"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Option = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			isDerived = false;
			xmlTag = "Optn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Right to buy (call) or sell (put) an underlying asset (securities, index, commodities, etc) at the predetermined price within a specified period of time";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Option1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Financial instrument that gives the holder the right to purchase shares
	 * or bonds at a given price within a specified time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Warrant1 Warrant1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Warrt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Warrant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
			isDerived = false;
			xmlTag = "Warrt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Warrant1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Agreement to buy or sell a specific amount of a commodity or financial
	 * instrument at a particular price on a stipulated future date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Future1 Future1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
	 * FinancialInstrumentProperties1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Futr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Future = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrumentProperties1Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			xmlTag = "Futr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Agreement to buy or sell a specific amount of a commodity or financial instrument at a particular price on a stipulated future date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Future1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Equity, com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Debt,
						com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Option, com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Warrant,
						com.tools20022.repository.choice.FinancialInstrumentProperties1Choice.Future);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentProperties1Choice";
				definition = "Alternative identification of a financial instrument other than an identifier.";
			}
		});
		return mmObject_lazy.get();
	}
}