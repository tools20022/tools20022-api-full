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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
 * provides an instruction to the account servicer to execute a foreign exchange
 * deal on behalf of the account owner. The purpose of the forex deal is to fund
 * the purchase of securities. This field is not to be used when standing
 * instructions have been established.
 * 
 * If CurrencyToSell is used, then it implies the following: - the instruction
 * is a receive. - the currency required for funding a purchase of securities,
 * eg, the currency to be purchased, is the currency of the settlement amount.
 * The currency to be sold to obtain settlement currency is provided by the
 * currency to sell message element. Normally, this is the base currency of the
 * portfolio. - the amount of currency to be bought is equal to the settlement
 * amount of the transaction. This implies the forex will not be used for other
 * transactions and that a bulk forex deal must be instructed by other means. -
 * a forex deal to fund the purchase of securities should be executed in time
 * for the currency to be available on the settlement date of the securities
 * transaction. - a bilateral agreement regarding the use of this field has been
 * established.
 * 
 * If CurrencyToBuy is used, then it implies the following: - the instruction is
 * a delivery - the currency received as proceeds from the sale of securities,
 * eg, the currency to be sold, is the currency of the settlement amount. The
 * currency to be bought is provided by the currency to buy message element. If
 * proceeds are repatriated, this is in the base currency of the portfolio. -
 * the amount of currency to be sold is equal to the settlement amount of the
 * transaction. This implies a bulk forex deal must be instructed by other
 * means. - a forex deal to repatriate proceeds after the sale of securities
 * should be executed for the soonest possible value date after settlement of
 * the securities, as permitted by market convention. - a bilateral agreement
 * regarding the use of this field has been established.
 */
public class ConstraintCurrencyToBuyOrSellRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25
	 * SecuritiesTradeDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails32
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails25> forSecuritiesTradeDetails25 = new MMConstraint<SecuritiesTradeDetails25>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails32);
			owner_lazy = () -> SecuritiesTradeDetails25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26
	 * SecuritiesTradeDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails34
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails26> forSecuritiesTradeDetails26 = new MMConstraint<SecuritiesTradeDetails26>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails34);
			owner_lazy = () -> SecuritiesTradeDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
	 * SecuritiesTradeDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28
	 * SecuritiesTradeDetails28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
	 * SecuritiesTradeDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails38
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails6> forSecuritiesTradeDetails6 = new MMConstraint<SecuritiesTradeDetails6>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38);
			owner_lazy = () -> SecuritiesTradeDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13
	 * SecuritiesTradeDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails13> forSecuritiesTradeDetails13 = new MMConstraint<SecuritiesTradeDetails13>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3
	 * SecuritiesTradeDetails3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails37
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails3> forSecuritiesTradeDetails3 = new MMConstraint<SecuritiesTradeDetails3>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails37);
			owner_lazy = () -> SecuritiesTradeDetails3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11
	 * SecuritiesTradeDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails11> forSecuritiesTradeDetails11 = new MMConstraint<SecuritiesTradeDetails11>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1
	 * SecuritiesTradeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails33
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails1> forSecuritiesTradeDetails1 = new MMConstraint<SecuritiesTradeDetails1>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails33);
			owner_lazy = () -> SecuritiesTradeDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15
	 * SecuritiesTradeDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order16 Order16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forOrder18
	 * ConstraintCurrencyToBuyOrSellRule.forOrder18}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order16> forOrder16 = new MMConstraint<Order16>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkOrder16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forOrder18);
			owner_lazy = () -> Order16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order14 Order14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forOrder17
	 * ConstraintCurrencyToBuyOrSellRule.forOrder17}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Order14> forOrder14 = new MMConstraint<Order14>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkOrder14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forOrder17);
			owner_lazy = () -> Order14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33
	 * SecuritiesTradeDetails33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails51
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails1
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails33> forSecuritiesTradeDetails33 = new MMConstraint<SecuritiesTradeDetails33>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails55
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails55}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails6
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails6}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails38> forSecuritiesTradeDetails38 = new MMConstraint<SecuritiesTradeDetails38>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails55);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails6;
			owner_lazy = () -> SecuritiesTradeDetails38.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37
	 * SecuritiesTradeDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails56
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails3
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails3}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails37> forSecuritiesTradeDetails37 = new MMConstraint<SecuritiesTradeDetails37>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails3;
			owner_lazy = () -> SecuritiesTradeDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34
	 * SecuritiesTradeDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails52
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails26
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails34> forSecuritiesTradeDetails34 = new MMConstraint<SecuritiesTradeDetails34>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails26;
			owner_lazy = () -> SecuritiesTradeDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32
	 * SecuritiesTradeDetails32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails50
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails25
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails25}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails32> forSecuritiesTradeDetails32 = new MMConstraint<SecuritiesTradeDetails32>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order17 Order17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forOrder14
	 * ConstraintCurrencyToBuyOrSellRule.forOrder14}</li>
	 * </ul>
	 */
	public static final MMConstraint<Order17> forOrder17 = new MMConstraint<Order17>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkOrder17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forOrder14;
			owner_lazy = () -> Order17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Order18 Order18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forOrder16
	 * ConstraintCurrencyToBuyOrSellRule.forOrder16}</li>
	 * </ul>
	 */
	public static final MMConstraint<Order18> forOrder18 = new MMConstraint<Order18>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkOrder18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuyOrSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \r\n\r\nIf CurrencyToSell is used, then it implies the following:\r\n- the instruction is to receive.\r\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \r\n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \r\n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \r\n- a bilateral agreement regarding the use of this field has been established.\r\n\r\nIf CurrencyToBuy is used, then it implies the following:\r\n- the instruction is to delivery\r\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \r\n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \r\n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \r\n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forOrder16;
			owner_lazy = () -> Order18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44
	 * SecuritiesTradeDetails44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39
	 * SecuritiesTradeDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails39> forSecuritiesTradeDetails39 = new MMConstraint<SecuritiesTradeDetails39>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40
	 * SecuritiesTradeDetails40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails40> forSecuritiesTradeDetails40 = new MMConstraint<SecuritiesTradeDetails40>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails40.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46
	 * SecuritiesTradeDetails46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails46.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47
	 * SecuritiesTradeDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51
	 * SecuritiesTradeDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails67
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails33
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails51> forSecuritiesTradeDetails51 = new MMConstraint<SecuritiesTradeDetails51>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55
	 * SecuritiesTradeDetails55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails38
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails55> forSecuritiesTradeDetails55 = new MMConstraint<SecuritiesTradeDetails55>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails38;
			owner_lazy = () -> SecuritiesTradeDetails55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56
	 * SecuritiesTradeDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails37
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails37}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails56> forSecuritiesTradeDetails56 = new MMConstraint<SecuritiesTradeDetails56>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails37;
			owner_lazy = () -> SecuritiesTradeDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52
	 * SecuritiesTradeDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails34
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails52> forSecuritiesTradeDetails52 = new MMConstraint<SecuritiesTradeDetails52>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails34;
			owner_lazy = () -> SecuritiesTradeDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50
	 * SecuritiesTradeDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails32
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails50> forSecuritiesTradeDetails50 = new MMConstraint<SecuritiesTradeDetails50>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59
	 * SecuritiesTradeDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails59> forSecuritiesTradeDetails59 = new MMConstraint<SecuritiesTradeDetails59>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58
	 * SecuritiesTradeDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails58> forSecuritiesTradeDetails58 = new MMConstraint<SecuritiesTradeDetails58>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63
	 * SecuritiesTradeDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65
	 * SecuritiesTradeDetails65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails65.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66
	 * SecuritiesTradeDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67
	 * SecuritiesTradeDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule#forSecuritiesTradeDetails51
	 * ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails67> forSecuritiesTradeDetails67 = new MMConstraint<SecuritiesTradeDetails67>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCurrencyToBuyOrSellRule.forSecuritiesTradeDetails51;
			owner_lazy = () -> SecuritiesTradeDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70
	 * SecuritiesTradeDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuyOrSellRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			validator = ConstraintCurrencyToBuyOrSellRule::checkSecuritiesTradeDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyToBuyOrSellRule";
			definition = "CurrencyToBuy and CurrencyToSell in the TradeDetails message component, provides an instruction to the account servicer to execute a foreign exchange deal on behalf of the account owner. The purpose of the forex deal is to fund the purchase of securities. This field is not to be used when standing instructions have been established. \n\nIf CurrencyToSell is used, then it implies the following:\n- the instruction is a receive.\n- the currency required for funding a purchase of securities, eg, the currency to be purchased, is the currency of the settlement amount. The currency to be sold to obtain settlement currency is provided by the currency to sell message element. Normally, this is the base currency of the portfolio. \n- the amount of currency to be bought is equal to the settlement amount of the transaction. This implies the forex will not be used for other transactions and that a bulk forex deal must be instructed by other means. \n- a forex deal to fund the purchase of securities should be executed in time for the currency to be available on the settlement date of the securities transaction. \n- a bilateral agreement regarding the use of this field has been established.\n\nIf CurrencyToBuy is used, then it implies the following:\n- the instruction is a delivery\n- the currency received as proceeds from the sale of securities, eg, the currency to be sold, is the currency of the settlement amount. The currency to be bought  is provided by the currency to buy message element. If proceeds are repatriated, this is in the base currency of the portfolio. \n- the amount of currency to be sold is equal to the settlement amount of the transaction. This implies a bulk forex deal must be instructed by other means. \n- a forex deal to repatriate proceeds after the sale of securities should be executed for the soonest possible value date after settlement of the securities, as permitted by market convention. \n- a bilateral agreement regarding the use of this field has been established.";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
		}
	};

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails25(SecuritiesTradeDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails26(SecuritiesTradeDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails27(SecuritiesTradeDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails28(SecuritiesTradeDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails6(SecuritiesTradeDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails13(SecuritiesTradeDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails3(SecuritiesTradeDetails3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails11(SecuritiesTradeDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails1(SecuritiesTradeDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails15(SecuritiesTradeDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder16(Order16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder14(Order14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails33(SecuritiesTradeDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails38(SecuritiesTradeDetails38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails37(SecuritiesTradeDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails34(SecuritiesTradeDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails32(SecuritiesTradeDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder17(Order17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuyOrSell in the TradeDetails message component, provides an
	 * instruction to the account servicer to execute a foreign exchange deal on
	 * behalf of the account owner. The purpose of the forex deal is to fund the
	 * purchase of securities. This field is not to be used when standing
	 * instructions have been established. <br>
	 * <br>
	 * If CurrencyToSell is used, then it implies the following:<br>
	 * - the instruction is to receive.<br>
	 * - the currency required for funding a purchase of securities, eg, the
	 * currency to be purchased, is the currency of the settlement amount. The
	 * currency to be sold to obtain settlement currency is provided by the
	 * currency to sell message element. Normally, this is the base currency of
	 * the portfolio. <br>
	 * - the amount of currency to be bought is equal to the settlement amount
	 * of the transaction. This implies the forex will not be used for other
	 * transactions and that a bulk forex deal must be instructed by other
	 * means. <br>
	 * - a forex deal to fund the purchase of securities should be executed in
	 * time for the currency to be available on the settlement date of the
	 * securities transaction. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.<br>
	 * <br>
	 * If CurrencyToBuy is used, then it implies the following:<br>
	 * - the instruction is to delivery<br>
	 * - the currency received as proceeds from the sale of securities, eg, the
	 * currency to be sold, is the currency of the settlement amount. The
	 * currency to be bought is provided by the currency to buy message element.
	 * If proceeds are repatriated, this is in the base currency of the
	 * portfolio. <br>
	 * - the amount of currency to be sold is equal to the settlement amount of
	 * the transaction. This implies a bulk forex deal must be instructed by
	 * other means. <br>
	 * - a forex deal to repatriate proceeds after the sale of securities should
	 * be executed for the soonest possible value date after settlement of the
	 * securities, as permitted by market convention. <br>
	 * - a bilateral agreement regarding the use of this field has been
	 * established.
	 */
	public static void checkOrder18(Order18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails44(SecuritiesTradeDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails39(SecuritiesTradeDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails40(SecuritiesTradeDetails40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails46(SecuritiesTradeDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails47(SecuritiesTradeDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails51(SecuritiesTradeDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails55(SecuritiesTradeDetails55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails56(SecuritiesTradeDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails52(SecuritiesTradeDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails50(SecuritiesTradeDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails59(SecuritiesTradeDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails58(SecuritiesTradeDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails63(SecuritiesTradeDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails65(SecuritiesTradeDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails67(SecuritiesTradeDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * CurrencyToBuy and CurrencyToSell in the TradeDetails message component,
	 * provides an instruction to the account servicer to execute a foreign
	 * exchange deal on behalf of the account owner. The purpose of the forex
	 * deal is to fund the purchase of securities. This field is not to be used
	 * when standing instructions have been established.
	 * 
	 * If CurrencyToSell is used, then it implies the following: - the
	 * instruction is a receive. - the currency required for funding a purchase
	 * of securities, eg, the currency to be purchased, is the currency of the
	 * settlement amount. The currency to be sold to obtain settlement currency
	 * is provided by the currency to sell message element. Normally, this is
	 * the base currency of the portfolio. - the amount of currency to be bought
	 * is equal to the settlement amount of the transaction. This implies the
	 * forex will not be used for other transactions and that a bulk forex deal
	 * must be instructed by other means. - a forex deal to fund the purchase of
	 * securities should be executed in time for the currency to be available on
	 * the settlement date of the securities transaction. - a bilateral
	 * agreement regarding the use of this field has been established.
	 * 
	 * If CurrencyToBuy is used, then it implies the following: - the
	 * instruction is a delivery - the currency received as proceeds from the
	 * sale of securities, eg, the currency to be sold, is the currency of the
	 * settlement amount. The currency to be bought is provided by the currency
	 * to buy message element. If proceeds are repatriated, this is in the base
	 * currency of the portfolio. - the amount of currency to be sold is equal
	 * to the settlement amount of the transaction. This implies a bulk forex
	 * deal must be instructed by other means. - a forex deal to repatriate
	 * proceeds after the sale of securities should be executed for the soonest
	 * possible value date after settlement of the securities, as permitted by
	 * market convention. - a bilateral agreement regarding the use of this
	 * field has been established.
	 */
	public static void checkSecuritiesTradeDetails70(SecuritiesTradeDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}