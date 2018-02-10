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
 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes
 * or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the
 * period during which the change or withdrawal of instruction is allowed.
 */
public class ConstraintRevocabilityPeriodRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption10> forCorporateActionOption10 = new MMConstraint<CorporateActionOption10>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15
	 * CorporateActionOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption15> forCorporateActionOption15 = new MMConstraint<CorporateActionOption15>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20
	 * CorporateActionOption20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption20> forCorporateActionOption20 = new MMConstraint<CorporateActionOption20>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32
	 * CorporateActionOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption32> forCorporateActionOption32 = new MMConstraint<CorporateActionOption32>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35
	 * CorporateActionOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption35> forCorporateActionOption35 = new MMConstraint<CorporateActionOption35>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44
	 * CorporateActionOption44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption44> forCorporateActionOption44 = new MMConstraint<CorporateActionOption44>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52
	 * CorporateActionOption52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption100
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption100}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption52> forCorporateActionOption52 = new MMConstraint<CorporateActionOption52>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption100);
			owner_lazy = () -> CorporateActionOption52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55
	 * CorporateActionOption55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption55> forCorporateActionOption55 = new MMConstraint<CorporateActionOption55>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption55.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3
	 * CorporateActionOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption3> forCorporateActionOption3 = new MMConstraint<CorporateActionOption3>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17
	 * CorporateActionOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption17> forCorporateActionOption17 = new MMConstraint<CorporateActionOption17>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19
	 * CorporateActionOption19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption19> forCorporateActionOption19 = new MMConstraint<CorporateActionOption19>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34
	 * CorporateActionOption34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption34> forCorporateActionOption34 = new MMConstraint<CorporateActionOption34>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36
	 * CorporateActionOption36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption36> forCorporateActionOption36 = new MMConstraint<CorporateActionOption36>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45
	 * CorporateActionOption45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption45> forCorporateActionOption45 = new MMConstraint<CorporateActionOption45>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption45.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51
	 * CorporateActionOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption101
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption101}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption51> forCorporateActionOption51 = new MMConstraint<CorporateActionOption51>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption101);
			owner_lazy = () -> CorporateActionOption51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56
	 * CorporateActionOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption56> forCorporateActionOption56 = new MMConstraint<CorporateActionOption56>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100
	 * CorporateActionOption100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption115
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption115}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption52
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption100> forCorporateActionOption100 = new MMConstraint<CorporateActionOption100>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption115);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption52;
			owner_lazy = () -> CorporateActionOption100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101
	 * CorporateActionOption101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption114
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption114}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption51
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption101> forCorporateActionOption101 = new MMConstraint<CorporateActionOption101>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption114);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption51;
			owner_lazy = () -> CorporateActionOption101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108
	 * CorporateActionOption108}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption108> forCorporateActionOption108 = new MMConstraint<CorporateActionOption108>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption108;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption108.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106
	 * CorporateActionOption106}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption106> forCorporateActionOption106 = new MMConstraint<CorporateActionOption106>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption106;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption106.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115
	 * CorporateActionOption115}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption129
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption129}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption100
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption100}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption115> forCorporateActionOption115 = new MMConstraint<CorporateActionOption115>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption115;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption129);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption100;
			owner_lazy = () -> CorporateActionOption115.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114
	 * CorporateActionOption114}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption130
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption130}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption101
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption101}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption114> forCorporateActionOption114 = new MMConstraint<CorporateActionOption114>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption114;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption130);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption101;
			owner_lazy = () -> CorporateActionOption114.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125
	 * CorporateActionOption125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption125> forCorporateActionOption125 = new MMConstraint<CorporateActionOption125>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption125;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption125.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127
	 * CorporateActionOption127}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption127> forCorporateActionOption127 = new MMConstraint<CorporateActionOption127>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption127;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption127.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130
	 * CorporateActionOption130}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption114
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption114}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption130> forCorporateActionOption130 = new MMConstraint<CorporateActionOption130>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption130;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption114;
			owner_lazy = () -> CorporateActionOption130.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129
	 * CorporateActionOption129}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule#forCorporateActionOption115
	 * ConstraintRevocabilityPeriodRule.forCorporateActionOption115}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption129> forCorporateActionOption129 = new MMConstraint<CorporateActionOption129>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption129;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRevocabilityPeriodRule.forCorporateActionOption115;
			owner_lazy = () -> CorporateActionOption129.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135
	 * CorporateActionOption135}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption135> forCorporateActionOption135 = new MMConstraint<CorporateActionOption135>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption135;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption135.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133
	 * CorporateActionOption133}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriodRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption133> forCorporateActionOption133 = new MMConstraint<CorporateActionOption133>() {
		{
			validator = ConstraintRevocabilityPeriodRule::checkCorporateActionOption133;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriodRule";
			definition = "If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be present to indicate the period during which the change or withdrawal of instruction is allowed.";
			owner_lazy = () -> CorporateActionOption133.mmObject();
		}
	};

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption10(CorporateActionOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption15(CorporateActionOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption20(CorporateActionOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption32(CorporateActionOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption35(CorporateActionOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption44(CorporateActionOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption52(CorporateActionOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption55(CorporateActionOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption3(CorporateActionOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption17(CorporateActionOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption19(CorporateActionOption19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption34(CorporateActionOption34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption36(CorporateActionOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption45(CorporateActionOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption51(CorporateActionOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalIndicator or ChangeAllowedIndicator is present and is true
	 * (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption56(CorporateActionOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption100(CorporateActionOption100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption101(CorporateActionOption101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption108(CorporateActionOption108 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * true (Yes or 1), then PeriodDetails/RevocabilityPeriod must be present to
	 * indicate the period during which the change or withdrawal of instruction
	 * is allowed.
	 */
	public static void checkCorporateActionOption106(CorporateActionOption106 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption115(CorporateActionOption115 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption114(CorporateActionOption114 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption125(CorporateActionOption125 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption127(CorporateActionOption127 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption130(CorporateActionOption130 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption129(CorporateActionOption129 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption135(CorporateActionOption135 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If WithdrawalAllowedIndicator or ChangeAllowedIndicator is present and is
	 * 'true' or '1' (Yes), then PeriodDetails/RevocabilityPeriod must be
	 * present to indicate the period during which the change or withdrawal of
	 * instruction is allowed.
	 */
	public static void checkCorporateActionOption133(CorporateActionOption133 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}