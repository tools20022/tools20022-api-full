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
 * If Market Type is OverTheCounter (OTCO), then Identification/Description must
 * specify a system.<br>
 * If Market Type is Exchange (EXCH), then
 * Identification/MarketIdentificationCode must be present.
 */
public class ConstraintMarketTypeAndIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification4
	 * MarketIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification78
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification78}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification4> forMarketIdentification4 = new MMConstraint<MarketIdentification4>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification78);
			owner_lazy = () -> MarketIdentification4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification5
	 * MarketIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification5> forMarketIdentification5 = new MMConstraint<MarketIdentification5>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			owner_lazy = () -> MarketIdentification5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification8
	 * MarketIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification8> forMarketIdentification8 = new MMConstraint<MarketIdentification8>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			owner_lazy = () -> MarketIdentification8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification9
	 * MarketIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification9> forMarketIdentification9 = new MMConstraint<MarketIdentification9>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			owner_lazy = () -> MarketIdentification9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification77
	 * MarketIdentification77}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification79
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification79}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification77> forMarketIdentification77 = new MMConstraint<MarketIdentification77>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification77;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification79);
			owner_lazy = () -> MarketIdentification77.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification13
	 * MarketIdentification13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification80
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification80}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification13> forMarketIdentification13 = new MMConstraint<MarketIdentification13>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification80);
			owner_lazy = () -> MarketIdentification13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification20
	 * MarketIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system. If MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification84
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification84}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification20> forMarketIdentification20 = new MMConstraint<MarketIdentification20>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system. If MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification84);
			owner_lazy = () -> MarketIdentification20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification21
	 * MarketIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification85
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification85}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification21> forMarketIdentification21 = new MMConstraint<MarketIdentification21>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If MarketType is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf MarketType is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification85);
			owner_lazy = () -> MarketIdentification21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification78
	 * MarketIdentification78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification4
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification4}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification78> forMarketIdentification78 = new MMConstraint<MarketIdentification78>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification4;
			owner_lazy = () -> MarketIdentification78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification79
	 * MarketIdentification79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification77
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification77}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification79> forMarketIdentification79 = new MMConstraint<MarketIdentification79>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification77;
			owner_lazy = () -> MarketIdentification79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification80
	 * MarketIdentification80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification13
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification13}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification80> forMarketIdentification80 = new MMConstraint<MarketIdentification80>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification80;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification13;
			owner_lazy = () -> MarketIdentification80.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification82
	 * MarketIdentification82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification82> forMarketIdentification82 = new MMConstraint<MarketIdentification82>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification82;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			owner_lazy = () -> MarketIdentification82.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification84
	 * MarketIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification20
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification20}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification84> forMarketIdentification84 = new MMConstraint<MarketIdentification84>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification84;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification20;
			owner_lazy = () -> MarketIdentification84.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification85
	 * MarketIdentification85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule#forMarketIdentification21
	 * ConstraintMarketTypeAndIdentificationRule.forMarketIdentification21}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification85> forMarketIdentification85 = new MMConstraint<MarketIdentification85>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMarketTypeAndIdentificationRule.forMarketIdentification21;
			owner_lazy = () -> MarketIdentification85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification88
	 * MarketIdentification88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification88> forMarketIdentification88 = new MMConstraint<MarketIdentification88>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification88;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Market Type is OverTheCounter (OTCO), then Identification/Description must specify a system.\r\nIf Market Type is Exchange (EXCH), then Identification/MarketIdentificationCode must be present.";
			owner_lazy = () -> MarketIdentification88.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification90
	 * MarketIdentification90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTypeAndIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification90> forMarketIdentification90 = new MMConstraint<MarketIdentification90>() {
		{
			validator = ConstraintMarketTypeAndIdentificationRule::checkMarketIdentification90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTypeAndIdentificationRule";
			definition = "If Type/Code is OverTheCounter (OTCO) and if Identification is present, then Identification/Description must specify a system.\r\nIf Type/Code is Exchange (EXCH) and if Identification is present, then Identification/MarketIdentifierCode must be present.";
			owner_lazy = () -> MarketIdentification90.mmObject();
		}
	};

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification4(MarketIdentification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification5(MarketIdentification5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification8(MarketIdentification8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification9(MarketIdentification9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification77(MarketIdentification77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification13(MarketIdentification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MarketType is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system. If MarketType is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification20(MarketIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If MarketType is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If MarketType is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification21(MarketIdentification21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification78(MarketIdentification78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification79(MarketIdentification79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification80(MarketIdentification80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification82(MarketIdentification82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification84(MarketIdentification84 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification85(MarketIdentification85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Market Type is OverTheCounter (OTCO), then Identification/Description
	 * must specify a system.<br>
	 * If Market Type is Exchange (EXCH), then
	 * Identification/MarketIdentificationCode must be present.
	 */
	public static void checkMarketIdentification88(MarketIdentification88 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is OverTheCounter (OTCO) and if Identification is present,
	 * then Identification/Description must specify a system.<br>
	 * If Type/Code is Exchange (EXCH) and if Identification is present, then
	 * Identification/MarketIdentifierCode must be present.
	 */
	public static void checkMarketIdentification90(MarketIdentification90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}