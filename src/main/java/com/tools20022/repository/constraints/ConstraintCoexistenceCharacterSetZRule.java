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

/**
 * During ISO 15022 – 20022 coexistence, characters used in URLAdress must
 * correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ %
 * &amp; * &lt; &gt; ; @ # { CR LF.
 */
public class ConstraintCoexistenceCharacterSetZRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation
	 * UpdatedURLlnformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetZRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in URLAdress must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ #  {  CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedURLlnformation> forUpdatedURLlnformation = new MMConstraint<UpdatedURLlnformation>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetZRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in URLAdress must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % & * < > ; @ #  {  CR LF.";
			owner_lazy = () -> UpdatedURLlnformation.mmObject();
		}

		@Override
		public void executeValidator(UpdatedURLlnformation obj) throws Exception {
			checkUpdatedURLlnformation(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation7
	 * UpdatedAdditionalInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetZRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ #  {  CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation7> forUpdatedAdditionalInformation7 = new MMConstraint<UpdatedAdditionalInformation7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetZRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % & * < > ; @ #  {  CR LF.";
			owner_lazy = () -> UpdatedAdditionalInformation7.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation7 obj) throws Exception {
			checkUpdatedAdditionalInformation7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation4
	 * UpdatedAdditionalInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetZRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ #  {  CR LF. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation4> forUpdatedAdditionalInformation4 = new MMConstraint<UpdatedAdditionalInformation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetZRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % & * < > ; @ #  {  CR LF. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> UpdatedAdditionalInformation4.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation4 obj) throws Exception {
			checkUpdatedAdditionalInformation4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2
	 * UpdatedAdditionalInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetZRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ #  {  CR LF."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation2> forUpdatedAdditionalInformation2 = new MMConstraint<UpdatedAdditionalInformation2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetZRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in AdditionalInformation must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % & * < > ; @ #  {  CR LF.";
			owner_lazy = () -> UpdatedAdditionalInformation2.mmObject();
		}

		@Override
		public void executeValidator(UpdatedAdditionalInformation2 obj) throws Exception {
			checkUpdatedAdditionalInformation2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation1
	 * UpdatedURLlnformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceCharacterSetZRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022 – 20022 coexistence, characters used in URLAdress must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ #  {  CR LF. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedURLlnformation1> forUpdatedURLlnformation1 = new MMConstraint<UpdatedURLlnformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceCharacterSetZRule";
			definition = "During ISO 15022 – 20022 coexistence, characters used in URLAdress must correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “ % & * < > ; @ #  {  CR LF. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> UpdatedURLlnformation1.mmObject();
		}

		@Override
		public void executeValidator(UpdatedURLlnformation1 obj) throws Exception {
			checkUpdatedURLlnformation1(obj);
		}
	};

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in URLAdress must
	 * correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “
	 * % &amp; * &lt; &gt; ; @ # { CR LF.
	 */
	public static void checkUpdatedURLlnformation(UpdatedURLlnformation obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in
	 * AdditionalInformation must correspond to character set Z, that is, a-z
	 * A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ # { CR LF.
	 */
	public static void checkUpdatedAdditionalInformation7(UpdatedAdditionalInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in
	 * AdditionalInformation must correspond to character set Z, that is, a-z
	 * A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ # { CR LF. In this
	 * message subset, a restricted data type was implemented to comply with
	 * this coexistence rule.
	 */
	public static void checkUpdatedAdditionalInformation4(UpdatedAdditionalInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in
	 * AdditionalInformation must correspond to character set Z, that is, a-z
	 * A-Z / - ? : ( ) . , ‘ += ! “ % &amp; * &lt; &gt; ; @ # { CR LF.
	 */
	public static void checkUpdatedAdditionalInformation2(UpdatedAdditionalInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022 – 20022 coexistence, characters used in URLAdress must
	 * correspond to character set Z, that is, a-z A-Z / - ? : ( ) . , ‘ += ! “
	 * % &amp; * &lt; &gt; ; @ # { CR LF. In this message subset, a restricted
	 * data type was implemented to comply with this coexistence rule.
	 */
	public static void checkUpdatedURLlnformation1(UpdatedURLlnformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}