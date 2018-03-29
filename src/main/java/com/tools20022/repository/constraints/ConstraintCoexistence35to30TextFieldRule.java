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
import com.tools20022.repository.choice.ClassificationType2Choice;
import com.tools20022.repository.choice.ClassificationType3Choice;
import com.tools20022.repository.choice.Number2Choice;
import com.tools20022.repository.choice.Number4Choice;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description must
 * be 30 characters or less. The field must not start or end with a slash ‘/’ or
 * contain two consecutive slashes ‘//’.
 */
public class ConstraintCoexistence35to30TextFieldRule {

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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule#forMarketIdentification78
	 * ConstraintCoexistence35to30TextFieldRule.forMarketIdentification78}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification4> forMarketIdentification4 = new MMConstraint<MarketIdentification4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule.forMarketIdentification78);
			owner_lazy = () -> MarketIdentification4.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification4 obj) throws Exception {
			checkMarketIdentification4(obj);
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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification5> forMarketIdentification5 = new MMConstraint<MarketIdentification5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> MarketIdentification5.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification5 obj) throws Exception {
			checkMarketIdentification5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice
	 * ClassificationType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, AlternateClassification identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ClassificationType2Choice> forClassificationType2Choice = new MMConstraint<ClassificationType2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, AlternateClassification identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> ClassificationType2Choice.mmObject();
		}

		@Override
		public void executeValidator(ClassificationType2Choice obj) throws Exception {
			checkClassificationType2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Number2Choice Number2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, (long) number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Number2Choice> forNumber2Choice = new MMConstraint<Number2Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, (long) number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’.";
			owner_lazy = () -> Number2Choice.mmObject();
		}

		@Override
		public void executeValidator(Number2Choice obj) throws Exception {
			checkNumber2Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3
	 * SafekeepingPlaceTypeAndText3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingPlaceTypeAndText3> forSafekeepingPlaceTypeAndText3 = new MMConstraint<SafekeepingPlaceTypeAndText3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’.";
			owner_lazy = () -> SafekeepingPlaceTypeAndText3.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingPlaceTypeAndText3 obj) throws Exception {
			checkSafekeepingPlaceTypeAndText3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification21
	 * GenericIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification21> forGenericIdentification21 = new MMConstraint<GenericIdentification21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’.";
			owner_lazy = () -> GenericIdentification21.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification21 obj) throws Exception {
			checkGenericIdentification21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification2
	 * AlternatePartyIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AlternatePartyIdentification2> forAlternatePartyIdentification2 = new MMConstraint<AlternatePartyIdentification2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> AlternatePartyIdentification2.mmObject();
		}

		@Override
		public void executeValidator(AlternatePartyIdentification2 obj) throws Exception {
			checkAlternatePartyIdentification2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1
	 * SecuritiesCertificate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate1> forSecuritiesCertificate1 = new MMConstraint<SecuritiesCertificate1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’.";
			owner_lazy = () -> SecuritiesCertificate1.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesCertificate1 obj) throws Exception {
			checkSecuritiesCertificate1(obj);
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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification8> forMarketIdentification8 = new MMConstraint<MarketIdentification8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> MarketIdentification8.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification8 obj) throws Exception {
			checkMarketIdentification8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.ClassificationType3Choice
	 * ClassificationType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, AlternateClassification identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ClassificationType3Choice> forClassificationType3Choice = new MMConstraint<ClassificationType3Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, AlternateClassification identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ClassificationType3Choice.mmObject();
		}

		@Override
		public void executeValidator(ClassificationType3Choice obj) throws Exception {
			checkClassificationType3Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.choice.Number4Choice Number4Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, (long) number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Number4Choice> forNumber4Choice = new MMConstraint<Number4Choice>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, (long) number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> Number4Choice.mmObject();
		}

		@Override
		public void executeValidator(Number4Choice obj) throws Exception {
			checkNumber4Choice(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4
	 * SafekeepingPlaceTypeAndText4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingPlaceTypeAndText4> forSafekeepingPlaceTypeAndText4 = new MMConstraint<SafekeepingPlaceTypeAndText4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SafekeepingPlaceTypeAndText4.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingPlaceTypeAndText4 obj) throws Exception {
			checkSafekeepingPlaceTypeAndText4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification26
	 * GenericIdentification26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification26> forGenericIdentification26 = new MMConstraint<GenericIdentification26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GenericIdentification26.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification26 obj) throws Exception {
			checkGenericIdentification26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification3
	 * AlternatePartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AlternatePartyIdentification3> forAlternatePartyIdentification3 = new MMConstraint<AlternatePartyIdentification3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> AlternatePartyIdentification3.mmObject();
		}

		@Override
		public void executeValidator(AlternatePartyIdentification3 obj) throws Exception {
			checkAlternatePartyIdentification3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
	 * SecuritiesCertificate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate2> forSecuritiesCertificate2 = new MMConstraint<SecuritiesCertificate2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, number must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesCertificate2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesCertificate2 obj) throws Exception {
			checkSecuritiesCertificate2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2
	 * SafekeepingPlaceTypeAndText2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingPlaceTypeAndText2> forSafekeepingPlaceTypeAndText2 = new MMConstraint<SafekeepingPlaceTypeAndText2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> SafekeepingPlaceTypeAndText2.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingPlaceTypeAndText2 obj) throws Exception {
			checkSafekeepingPlaceTypeAndText2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5
	 * SafekeepingPlaceTypeAndText5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SafekeepingPlaceTypeAndText5> forSafekeepingPlaceTypeAndText5 = new MMConstraint<SafekeepingPlaceTypeAndText5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, Identification must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two cons\tecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SafekeepingPlaceTypeAndText5.mmObject();
		}

		@Override
		public void executeValidator(SafekeepingPlaceTypeAndText5 obj) throws Exception {
			checkSafekeepingPlaceTypeAndText5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification2
	 * MarketIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification2> forMarketIdentification2 = new MMConstraint<MarketIdentification2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> MarketIdentification2.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification2 obj) throws Exception {
			checkMarketIdentification2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification7
	 * MarketIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification7> forMarketIdentification7 = new MMConstraint<MarketIdentification7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> MarketIdentification7.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification7 obj) throws Exception {
			checkMarketIdentification7(obj);
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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification9> forMarketIdentification9 = new MMConstraint<MarketIdentification9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> MarketIdentification9.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification9 obj) throws Exception {
			checkMarketIdentification9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification6
	 * MarketIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification6> forMarketIdentification6 = new MMConstraint<MarketIdentification6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			owner_lazy = () -> MarketIdentification6.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification6 obj) throws Exception {
			checkMarketIdentification6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification10
	 * MarketIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification10> forMarketIdentification10 = new MMConstraint<MarketIdentification10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> MarketIdentification10.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification10 obj) throws Exception {
			checkMarketIdentification10(obj);
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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule#forMarketIdentification4
	 * ConstraintCoexistence35to30TextFieldRule.forMarketIdentification4}</li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification78> forMarketIdentification78 = new MMConstraint<MarketIdentification78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintCoexistence35to30TextFieldRule.forMarketIdentification4;
			owner_lazy = () -> MarketIdentification78.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification78 obj) throws Exception {
			checkMarketIdentification78(obj);
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
	 * name} = "Coexistence35to30TextFieldRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MarketIdentification82> forMarketIdentification82 = new MMConstraint<MarketIdentification82>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Coexistence35to30TextFieldRule";
			definition = "During ISO 15022 – 20022 coexistence, MarketIdentification/Description must be 30 characters or less. The field must not start or end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> MarketIdentification82.mmObject();
		}

		@Override
		public void executeValidator(MarketIdentification82 obj) throws Exception {
			checkMarketIdentification82(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkMarketIdentification4(MarketIdentification4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkMarketIdentification5(MarketIdentification5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, AlternateClassification
	 * identification must be 30 characters or less. The field must not start or
	 * end with a slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkClassificationType2Choice(ClassificationType2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, (long) number must be 30 characters
	 * or less. The field must not start or end with a slash ‘/’ or contain two
	 * cons ecutive slashes ‘//’.
	 */
	public static void checkNumber2Choice(Number2Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’.
	 */
	public static void checkSafekeepingPlaceTypeAndText3(SafekeepingPlaceTypeAndText3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’.
	 */
	public static void checkGenericIdentification21(GenericIdentification21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two consecutive slashes ‘//’.
	 */
	public static void checkAlternatePartyIdentification2(AlternatePartyIdentification2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, number must be 30 characters or
	 * less. The field must not start or end with a slash ‘/’ or contain two
	 * cons ecutive slashes ‘//’.
	 */
	public static void checkSecuritiesCertificate1(SecuritiesCertificate1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkMarketIdentification8(MarketIdentification8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, AlternateClassification
	 * identification must be 30 characters or less. The field must not start or
	 * end with a slash ‘/’ or contain two consecutive slashes ‘//’. In this
	 * message subset, a restricted data type was implemented to comply with
	 * this coexistence rule.
	 */
	public static void checkClassificationType3Choice(ClassificationType3Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, (long) number must be 30 characters
	 * or less. The field must not start or end with a slash ‘/’ or contain two
	 * cons ecutive slashes ‘//’. In this message subset, a restricted data type
	 * was implemented to comply with this coexistence rule.
	 */
	public static void checkNumber4Choice(Number4Choice obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSafekeepingPlaceTypeAndText4(SafekeepingPlaceTypeAndText4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkGenericIdentification26(GenericIdentification26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, AlternateIdentification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two consecutive slashes ‘//’. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkAlternatePartyIdentification3(AlternatePartyIdentification3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, number must be 30 characters or
	 * less. The field must not start or end with a slash ‘/’ or contain two
	 * cons ecutive slashes ‘//’. In this message subset, a restricted data type
	 * was implemented to comply with this coexistence rule.
	 */
	public static void checkSecuritiesCertificate2(SecuritiesCertificate2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two consecutive slashes ‘//’.
	 */
	public static void checkSafekeepingPlaceTypeAndText2(SafekeepingPlaceTypeAndText2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, Identification must be 30
	 * characters or less. The field must not start or end with a slash ‘/’ or
	 * contain two cons ecutive slashes ‘//’. In this message subset, a
	 * restricted data type was implemented to comply with this coexistence
	 * rule.
	 */
	public static void checkSafekeepingPlaceTypeAndText5(SafekeepingPlaceTypeAndText5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkMarketIdentification2(MarketIdentification2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkMarketIdentification7(MarketIdentification7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkMarketIdentification9(MarketIdentification9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkMarketIdentification6(MarketIdentification6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkMarketIdentification10(MarketIdentification10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’.
	 */
	public static void checkMarketIdentification78(MarketIdentification78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, MarketIdentification/Description
	 * must be 30 characters or less. The field must not start or end with a
	 * slash ‘/’ or contain two consecutive slashes ‘//’. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkMarketIdentification82(MarketIdentification82 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}