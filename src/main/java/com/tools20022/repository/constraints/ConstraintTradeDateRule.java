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
 * If Trade Date/Time is present with a time or a time + UTC indicator, then it
 * must be the local time of the place of trade, for example, of the stock
 * exchange, or of the selling broker for OTC.
 */
public class ConstraintTradeDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails68
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails68;
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails81
	 * SecuritiesTradeDetails81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails81> forSecuritiesTradeDetails81 = new MMConstraint<SecuritiesTradeDetails81>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails81.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails81 obj) throws Exception {
			checkSecuritiesTradeDetails81(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24
	 * SecuritiesTradeDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails48
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails48}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails24> forSecuritiesTradeDetails24 = new MMConstraint<SecuritiesTradeDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails48);
			owner_lazy = () -> SecuritiesTradeDetails24.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails24 obj) throws Exception {
			checkSecuritiesTradeDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails42 obj) throws Exception {
			checkSecuritiesTradeDetails42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails22 obj) throws Exception {
			checkSecuritiesTradeDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
	 * SecuritiesTradeDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails71
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails71}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails49
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is present with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails71);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails68 obj) throws Exception {
			checkSecuritiesTradeDetails68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85
	 * SecuritiesTradeDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails85> forSecuritiesTradeDetails85 = new MMConstraint<SecuritiesTradeDetails85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails85.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails85 obj) throws Exception {
			checkSecuritiesTradeDetails85(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
	 * SecuritiesTradeDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails48
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails48}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails72> forSecuritiesTradeDetails72 = new MMConstraint<SecuritiesTradeDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, for example, of the stock exchange, or of the selling broker for OTC.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails48;
			owner_lazy = () -> SecuritiesTradeDetails72.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails72 obj) throws Exception {
			checkSecuritiesTradeDetails72(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
	 * SecuritiesTradeDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails69 obj) throws Exception {
			checkSecuritiesTradeDetails69(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails4 obj) throws Exception {
			checkSecuritiesTradeDetails4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails35
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails23 obj) throws Exception {
			checkSecuritiesTradeDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails19
	 * SecuritiesTradeDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails19> forSecuritiesTradeDetails19 = new MMConstraint<SecuritiesTradeDetails19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails19.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails19 obj) throws Exception {
			checkSecuritiesTradeDetails19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails72
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails72}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails24
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails24}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails48> forSecuritiesTradeDetails48 = new MMConstraint<SecuritiesTradeDetails48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails72);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails24;
			owner_lazy = () -> SecuritiesTradeDetails48.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails48 obj) throws Exception {
			checkSecuritiesTradeDetails48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails20
	 * SecuritiesTradeDetails20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails20> forSecuritiesTradeDetails20 = new MMConstraint<SecuritiesTradeDetails20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails20.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails20 obj) throws Exception {
			checkSecuritiesTradeDetails20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
	 * SecuritiesTradeDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails68
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails35
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails49 obj) throws Exception {
			checkSecuritiesTradeDetails49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails30
	 * SecuritiesTradeDetails30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails30> forSecuritiesTradeDetails30 = new MMConstraint<SecuritiesTradeDetails30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails30.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails30 obj) throws Exception {
			checkSecuritiesTradeDetails30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails29 obj) throws Exception {
			checkSecuritiesTradeDetails29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails10 obj) throws Exception {
			checkSecuritiesTradeDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
	 * SecuritiesTradeDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails61 obj) throws Exception {
			checkSecuritiesTradeDetails61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails7
	 * SecuritiesTradeDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails7> forSecuritiesTradeDetails7 = new MMConstraint<SecuritiesTradeDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails7.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails7 obj) throws Exception {
			checkSecuritiesTradeDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails57
	 * SecuritiesTradeDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails57> forSecuritiesTradeDetails57 = new MMConstraint<SecuritiesTradeDetails57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails57.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails57 obj) throws Exception {
			checkSecuritiesTradeDetails57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails17 obj) throws Exception {
			checkSecuritiesTradeDetails17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails14
	 * SecuritiesTradeDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails14> forSecuritiesTradeDetails14 = new MMConstraint<SecuritiesTradeDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			owner_lazy = () -> SecuritiesTradeDetails14.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails14 obj) throws Exception {
			checkSecuritiesTradeDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails49
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails23
	 * ConstraintTradeDateRule.forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateRule";
			definition = "If Trade Date/Time is used with a time or a time + UTC indicator, then it must be the local time of the place of trade, eg, of the stock exchange, or of the selling broker for OTC.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails35 obj) throws Exception {
			checkSecuritiesTradeDetails35(obj);
		}
	};

	/**
	 * If Trade Date/Time is present with a time or a time + UTC indicator, then
	 * it must be the local time of the place of trade, for example, of the
	 * stock exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails81(SecuritiesTradeDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails24(SecuritiesTradeDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is present with a time or a time + UTC indicator, then
	 * it must be the local time of the place of trade, eg, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails85(SecuritiesTradeDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, for example, of the stock
	 * exchange, or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails72(SecuritiesTradeDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails19(SecuritiesTradeDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails48(SecuritiesTradeDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails20(SecuritiesTradeDetails20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails30(SecuritiesTradeDetails30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails7(SecuritiesTradeDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails57(SecuritiesTradeDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails14(SecuritiesTradeDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Trade Date/Time is used with a time or a time + UTC indicator, then it
	 * must be the local time of the place of trade, eg, of the stock exchange,
	 * or of the selling broker for OTC.
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}