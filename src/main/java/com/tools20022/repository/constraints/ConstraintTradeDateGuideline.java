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
 * In addition to the settlement date (ISO 20022 mandatory), trade date is one
 * of the 10 common elements recommended by SMPG for equities and fixed income
 * settlement instructions.<br>
 * For more details, see the relevant market practice document on www.smpg.info
 */
public class ConstraintTradeDateGuideline {

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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails32
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails25> forSecuritiesTradeDetails25 = new MMConstraint<SecuritiesTradeDetails25>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails32);
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails34
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails26> forSecuritiesTradeDetails26 = new MMConstraint<SecuritiesTradeDetails26>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails34);
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails27> forSecuritiesTradeDetails27 = new MMConstraint<SecuritiesTradeDetails27>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails28> forSecuritiesTradeDetails28 = new MMConstraint<SecuritiesTradeDetails28>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2
	 * SecuritiesTradeDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails31
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails2> forSecuritiesTradeDetails2 = new MMConstraint<SecuritiesTradeDetails2>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails31);
			owner_lazy = () -> SecuritiesTradeDetails2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16
	 * SecuritiesTradeDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails16> forSecuritiesTradeDetails16 = new MMConstraint<SecuritiesTradeDetails16>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails16.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails33
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails1> forSecuritiesTradeDetails1 = new MMConstraint<SecuritiesTradeDetails1>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails33);
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails15> forSecuritiesTradeDetails15 = new MMConstraint<SecuritiesTradeDetails15>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31
	 * SecuritiesTradeDetails31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails53
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails53}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails2
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails2}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails31> forSecuritiesTradeDetails31 = new MMConstraint<SecuritiesTradeDetails31>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails53);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails2;
			owner_lazy = () -> SecuritiesTradeDetails31.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails51
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails1
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails1}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails33> forSecuritiesTradeDetails33 = new MMConstraint<SecuritiesTradeDetails33>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails1;
			owner_lazy = () -> SecuritiesTradeDetails33.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails52
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails52}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails26
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails26}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails34> forSecuritiesTradeDetails34 = new MMConstraint<SecuritiesTradeDetails34>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails52);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails26;
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails50
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails25
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails25}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails32> forSecuritiesTradeDetails32 = new MMConstraint<SecuritiesTradeDetails32>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails25;
			owner_lazy = () -> SecuritiesTradeDetails32.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails44> forSecuritiesTradeDetails44 = new MMConstraint<SecuritiesTradeDetails44>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails44.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43
	 * SecuritiesTradeDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails43> forSecuritiesTradeDetails43 = new MMConstraint<SecuritiesTradeDetails43>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails43.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails46> forSecuritiesTradeDetails46 = new MMConstraint<SecuritiesTradeDetails46>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails47> forSecuritiesTradeDetails47 = new MMConstraint<SecuritiesTradeDetails47>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails67
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails67}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails33
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails33}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails51> forSecuritiesTradeDetails51 = new MMConstraint<SecuritiesTradeDetails51>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails67);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails33;
			owner_lazy = () -> SecuritiesTradeDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
	 * SecuritiesTradeDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails31
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails31}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails53> forSecuritiesTradeDetails53 = new MMConstraint<SecuritiesTradeDetails53>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails31;
			owner_lazy = () -> SecuritiesTradeDetails53.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails34
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails34}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails52> forSecuritiesTradeDetails52 = new MMConstraint<SecuritiesTradeDetails52>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails34;
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails32
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails32}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails50> forSecuritiesTradeDetails50 = new MMConstraint<SecuritiesTradeDetails50>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails32;
			owner_lazy = () -> SecuritiesTradeDetails50.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails63> forSecuritiesTradeDetails63 = new MMConstraint<SecuritiesTradeDetails63>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62
	 * SecuritiesTradeDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails62> forSecuritiesTradeDetails62 = new MMConstraint<SecuritiesTradeDetails62>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails62.mmObject();
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails65> forSecuritiesTradeDetails65 = new MMConstraint<SecuritiesTradeDetails65>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails65;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails66> forSecuritiesTradeDetails66 = new MMConstraint<SecuritiesTradeDetails66>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateGuideline#forSecuritiesTradeDetails51
	 * ConstraintTradeDateGuideline.forSecuritiesTradeDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails67> forSecuritiesTradeDetails67 = new MMConstraint<SecuritiesTradeDetails67>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTradeDateGuideline.forSecuritiesTradeDetails51;
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
	 * name} = "TradeDateGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails70> forSecuritiesTradeDetails70 = new MMConstraint<SecuritiesTradeDetails70>() {
		{
			validator = ConstraintTradeDateGuideline::checkSecuritiesTradeDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateGuideline";
			definition = "In addition to the settlement date (ISO 20022 mandatory), trade date is one of the 10 common elements recommended by SMPG for equities and fixed income settlement instructions.\r\nFor more details, see the relevant market practice document on www.smpg.info";
			owner_lazy = () -> SecuritiesTradeDetails70.mmObject();
		}
	};

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails25(SecuritiesTradeDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails26(SecuritiesTradeDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails27(SecuritiesTradeDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails28(SecuritiesTradeDetails28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails2(SecuritiesTradeDetails2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails16(SecuritiesTradeDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails1(SecuritiesTradeDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails15(SecuritiesTradeDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails31(SecuritiesTradeDetails31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails33(SecuritiesTradeDetails33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails34(SecuritiesTradeDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails32(SecuritiesTradeDetails32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails44(SecuritiesTradeDetails44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails43(SecuritiesTradeDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails46(SecuritiesTradeDetails46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails47(SecuritiesTradeDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails51(SecuritiesTradeDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails53(SecuritiesTradeDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails52(SecuritiesTradeDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails50(SecuritiesTradeDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails63(SecuritiesTradeDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails62(SecuritiesTradeDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails65(SecuritiesTradeDetails65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails66(SecuritiesTradeDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails67(SecuritiesTradeDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * In addition to the settlement date (ISO 20022 mandatory), trade date is
	 * one of the 10 common elements recommended by SMPG for equities and fixed
	 * income settlement instructions.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info
	 */
	public static void checkSecuritiesTradeDetails70(SecuritiesTradeDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}