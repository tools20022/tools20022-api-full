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
import com.tools20022.repository.choice.TradingVenueIdentification1Choice;
import com.tools20022.repository.msg.*;

/**
 * Market Identification code must be an active market at the time of reporting.
 */
public class ConstraintValidMICRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.TradingVenueIdentification1Choice
	 * TradingVenueIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TradingVenueIdentification1Choice> forTradingVenueIdentification1Choice = new MMConstraint<TradingVenueIdentification1Choice>() {
		{
			validator = ConstraintValidMICRule::checkTradingVenueIdentification1Choice;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Market Identification code must be an active market at the time of reporting.";
			owner_lazy = () -> TradingVenueIdentification1Choice.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TradingVenueAttributes1> forTradingVenueAttributes1 = new MMConstraint<TradingVenueAttributes1>() {
		{
			validator = ConstraintValidMICRule::checkTradingVenueAttributes1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Market Identification code must be an active market at the time of reporting.";
			owner_lazy = () -> TradingVenueAttributes1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.VolumeCapReport1
	 * VolumeCapReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where populated, the market identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<VolumeCapReport1> forVolumeCapReport1 = new MMConstraint<VolumeCapReport1>() {
		{
			validator = ConstraintValidMICRule::checkVolumeCapReport1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Where populated, the market identification code must be an active market at the time of reporting.";
			owner_lazy = () -> VolumeCapReport1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11
	 * TransparencyDataReport11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where reported, Market Identification code must be an active market for that reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport11> forTransparencyDataReport11 = new MMConstraint<TransparencyDataReport11>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Where reported, Market Identification code must be an active market for that reporting period.";
			owner_lazy = () -> TransparencyDataReport11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport13
	 * TransparencyDataReport13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport13> forTransparencyDataReport13 = new MMConstraint<TransparencyDataReport13>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Market Identification code must be an active market at the time of reporting.";
			owner_lazy = () -> TransparencyDataReport13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12
	 * TransparencyDataReport12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where reported, market Identification code must be an active market for that reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport12> forTransparencyDataReport12 = new MMConstraint<TransparencyDataReport12>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Where reported, market Identification code must be an active market for that reporting period.";
			owner_lazy = () -> TransparencyDataReport12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport15
	 * TransparencyDataReport15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport15> forTransparencyDataReport15 = new MMConstraint<TransparencyDataReport15>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Market Identification code must be an active market at the time of reporting.";
			owner_lazy = () -> TransparencyDataReport15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10
	 * TransparencyDataReport10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where reported, Market Identification code must be an active market for that reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport10> forTransparencyDataReport10 = new MMConstraint<TransparencyDataReport10>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Where reported, Market Identification code must be an active market for that reporting period.";
			owner_lazy = () -> TransparencyDataReport10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14
	 * TransparencyDataReport14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where reported, market Identification code must be an active market for that reporting period."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransparencyDataReport14> forTransparencyDataReport14 = new MMConstraint<TransparencyDataReport14>() {
		{
			validator = ConstraintValidMICRule::checkTransparencyDataReport14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Where reported, market Identification code must be an active market for that reporting period.";
			owner_lazy = () -> TransparencyDataReport14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketDetail2 MarketDetail2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidMICRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market Identification code must be an active market at the time of reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketDetail2> forMarketDetail2 = new MMConstraint<MarketDetail2>() {
		{
			validator = ConstraintValidMICRule::checkMarketDetail2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidMICRule";
			definition = "Market Identification code must be an active market at the time of reporting.";
			owner_lazy = () -> MarketDetail2.mmObject();
		}
	};

	/**
	 * Market Identification code must be an active market at the time of
	 * reporting.
	 */
	public static void checkTradingVenueIdentification1Choice(TradingVenueIdentification1Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Market Identification code must be an active market at the time of
	 * reporting.
	 */
	public static void checkTradingVenueAttributes1(TradingVenueAttributes1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Where populated, the market identification code must be an active market
	 * at the time of reporting.
	 */
	public static void checkVolumeCapReport1(VolumeCapReport1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Where reported, Market Identification code must be an active market for
	 * that reporting period.
	 */
	public static void checkTransparencyDataReport11(TransparencyDataReport11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Market Identification code must be an active market at the time of
	 * reporting.
	 */
	public static void checkTransparencyDataReport13(TransparencyDataReport13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Where reported, market Identification code must be an active market for
	 * that reporting period.
	 */
	public static void checkTransparencyDataReport12(TransparencyDataReport12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Market Identification code must be an active market at the time of
	 * reporting.
	 */
	public static void checkTransparencyDataReport15(TransparencyDataReport15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Where reported, Market Identification code must be an active market for
	 * that reporting period.
	 */
	public static void checkTransparencyDataReport10(TransparencyDataReport10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Where reported, market Identification code must be an active market for
	 * that reporting period.
	 */
	public static void checkTransparencyDataReport14(TransparencyDataReport14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Market Identification code must be an active market at the time of
	 * reporting.
	 */
	public static void checkMarketDetail2(MarketDetail2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}