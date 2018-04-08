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
import com.tools20022.repository.msg.PostalAddress21;
import com.tools20022.repository.msg.PostalAddress3;
import java.util.Arrays;

/**
 * If RegistrationAddressIndicator is "true" or "1" (Yes), then MailingIndicator
 * must be "true" or "1".
 */
public class ConstraintMailingIndicatorRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RegistrationAddressIndicator is \"true\" or \"1\" (Yes), then MailingIndicator must be \"true\" or \"1\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMailingIndicatorRule#forPostalAddress3
	 * ConstraintMailingIndicatorRule.forPostalAddress3}</li>
	 * </ul>
	 */
	public static final MMConstraint<PostalAddress21> forPostalAddress21 = new MMConstraint<PostalAddress21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailingIndicatorRule";
			definition = "If RegistrationAddressIndicator is \"true\" or \"1\" (Yes), then MailingIndicator must be \"true\" or \"1\".";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMailingIndicatorRule.forPostalAddress3;
			owner_lazy = () -> PostalAddress21.mmObject();
		}

		@Override
		public void executeValidator(PostalAddress21 obj) throws Exception {
			checkPostalAddress21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress3 PostalAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailingIndicatorRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RegistrationAddressIndicator is \"true\" or \"1\" (Yes), then MailingIndicator must be \"true\" or \"1\"."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMailingIndicatorRule#forPostalAddress21
	 * ConstraintMailingIndicatorRule.forPostalAddress21}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PostalAddress3> forPostalAddress3 = new MMConstraint<PostalAddress3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailingIndicatorRule";
			definition = "If RegistrationAddressIndicator is \"true\" or \"1\" (Yes), then MailingIndicator must be \"true\" or \"1\".";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMailingIndicatorRule.forPostalAddress21);
			owner_lazy = () -> PostalAddress3.mmObject();
		}

		@Override
		public void executeValidator(PostalAddress3 obj) throws Exception {
			checkPostalAddress3(obj);
		}
	};

	/**
	 * If RegistrationAddressIndicator is "true" or "1" (Yes), then
	 * MailingIndicator must be "true" or "1".
	 */
	public static void checkPostalAddress21(PostalAddress21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RegistrationAddressIndicator is "true" or "1" (Yes), then
	 * MailingIndicator must be "true" or "1".
	 */
	public static void checkPostalAddress3(PostalAddress3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}