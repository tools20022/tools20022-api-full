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
 * If Type is not VARIOUS then Identification must be present.
 */
public class ConstraintIdentificationPresenceRule {

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
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not VARIOUS then Identification must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forMarketIdentification79
	 * ConstraintIdentificationPresenceRule.forMarketIdentification79}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification77> forMarketIdentification77 = new MMConstraint<MarketIdentification77>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If Type is not VARIOUS then Identification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forMarketIdentification79);
			owner_lazy = () -> MarketIdentification77.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification77 obj) throws Exception {
			checkMarketIdentification77(obj);
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
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type is not VARIOUS then Identification must be present."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forMarketIdentification80
	 * ConstraintIdentificationPresenceRule.forMarketIdentification80}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification13> forMarketIdentification13 = new MMConstraint<MarketIdentification13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If Type is not VARIOUS then Identification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forMarketIdentification80);
			owner_lazy = () -> MarketIdentification13.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification13 obj) throws Exception {
			checkMarketIdentification13(obj);
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
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then Identification must be present.\r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forMarketIdentification77
	 * ConstraintIdentificationPresenceRule.forMarketIdentification77}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification79> forMarketIdentification79 = new MMConstraint<MarketIdentification79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then Identification must be present.\r\n\r\n";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forMarketIdentification77;
			owner_lazy = () -> MarketIdentification79.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification79 obj) throws Exception {
			checkMarketIdentification79(obj);
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
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then Identification must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forMarketIdentification13
	 * ConstraintIdentificationPresenceRule.forMarketIdentification13}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification80> forMarketIdentification80 = new MMConstraint<MarketIdentification80>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then Identification must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forMarketIdentification13;
			owner_lazy = () -> MarketIdentification80.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification80 obj) throws Exception {
			checkMarketIdentification80(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification62
	 * PartyIdentification62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProprietaryIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/BICFI&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/NameAndAddress&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BICFI is absent or NameAndAddress is absent then ProprietaryIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forPartyIdentification64
	 * ConstraintIdentificationPresenceRule.forPartyIdentification64}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification62> forPartyIdentification62 = new MMConstraint<PartyIdentification62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If BICFI is absent or NameAndAddress is absent then ProprietaryIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forPartyIdentification64);
			owner_lazy = () -> PartyIdentification62.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProprietaryIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/BICFI</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/NameAndAddress</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PartyIdentification62 obj) throws Exception {
			checkPartyIdentification62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification64
	 * PartyIdentification64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ProprietaryIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/AnyBIC&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/NameAndAddress&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If AnyBIC is absent or NameAndAddress is absent then ProprietaryIdentification must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule#forPartyIdentification62
	 * ConstraintIdentificationPresenceRule.forPartyIdentification62}</li>
	 * </ul>
	 */
	public static final MMConstraint<PartyIdentification64> forPartyIdentification64 = new MMConstraint<PartyIdentification64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationPresenceRule";
			definition = "If AnyBIC is absent or NameAndAddress is absent then ProprietaryIdentification must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIdentificationPresenceRule.forPartyIdentification62;
			owner_lazy = () -> PartyIdentification64.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ProprietaryIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>OR</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/AnyBIC</leftOperand></BooleanRule><BooleanRule xsi:type=\"Absence\"><leftOperand>/NameAndAddress</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(PartyIdentification64 obj) throws Exception {
			checkPartyIdentification64(obj);
		}
	};

	/**
	 * If Type is not VARIOUS then Identification must be present.
	 */
	public static void checkMarketIdentification77(MarketIdentification77 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type is not VARIOUS then Identification must be present.
	 */
	public static void checkMarketIdentification13(MarketIdentification13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then
	 * Identification must be present.<br>
	 * <br>
	 */
	public static void checkMarketIdentification79(MarketIdentification79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Type/Code is not Various (VARI) OR Over The Counter (OTCO) then
	 * Identification must be present.
	 */
	public static void checkMarketIdentification80(MarketIdentification80 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If BICFI is absent or NameAndAddress is absent then
	 * ProprietaryIdentification must be present.
	 */
	public static void checkPartyIdentification62(PartyIdentification62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If AnyBIC is absent or NameAndAddress is absent then
	 * ProprietaryIdentification must be present.
	 */
	public static void checkPartyIdentification64(PartyIdentification64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}