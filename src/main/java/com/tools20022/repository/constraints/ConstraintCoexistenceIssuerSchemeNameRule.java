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
 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters and
 * SchemeName length must be 4 characters or less. Issuer and Scheme Name must
 * be an ISO registered Issuer and SchemeName. In this message subset, a
 * restricted data type was implemented to comply with this coexistence rule.
 */
public class ConstraintCoexistenceIssuerSchemeNameRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification24
	 * GenericIdentification24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification24> forGenericIdentification24 = new MMConstraint<GenericIdentification24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GenericIdentification24.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification24 obj) throws Exception {
			checkGenericIdentification24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity5
	 * ProprietaryQuantity5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity5> forProprietaryQuantity5 = new MMConstraint<ProprietaryQuantity5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ProprietaryQuantity5.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity5 obj) throws Exception {
			checkProprietaryQuantity5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification34
	 * GenericIdentification34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification34> forGenericIdentification34 = new MMConstraint<GenericIdentification34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification34.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification34 obj) throws Exception {
			checkGenericIdentification34(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity3
	 * ProprietaryQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity3> forProprietaryQuantity3 = new MMConstraint<ProprietaryQuantity3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> ProprietaryQuantity3.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity3 obj) throws Exception {
			checkProprietaryQuantity3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification20> forGenericIdentification20 = new MMConstraint<GenericIdentification20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification20 obj) throws Exception {
			checkGenericIdentification20(obj);
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
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate1> forSecuritiesCertificate1 = new MMConstraint<SecuritiesCertificate1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
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
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification22
	 * GenericIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification22> forGenericIdentification22 = new MMConstraint<GenericIdentification22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification22.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification22 obj) throws Exception {
			checkGenericIdentification22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity6
	 * ProprietaryQuantity6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity6> forProprietaryQuantity6 = new MMConstraint<ProprietaryQuantity6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> ProprietaryQuantity6.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity6 obj) throws Exception {
			checkProprietaryQuantity6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity2
	 * ProprietaryQuantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity2> forProprietaryQuantity2 = new MMConstraint<ProprietaryQuantity2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> ProprietaryQuantity2.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity2 obj) throws Exception {
			checkProprietaryQuantity2(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryQuantity4
	 * ProprietaryQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ProprietaryQuantity4> forProprietaryQuantity4 = new MMConstraint<ProprietaryQuantity4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> ProprietaryQuantity4.mmObject();
		}

		@Override
		public void executeValidator(ProprietaryQuantity4 obj) throws Exception {
			checkProprietaryQuantity4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification23
	 * GenericIdentification23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification23> forGenericIdentification23 = new MMConstraint<GenericIdentification23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GenericIdentification23.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification23 obj) throws Exception {
			checkGenericIdentification23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification51
	 * GenericIdentification51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification51> forGenericIdentification51 = new MMConstraint<GenericIdentification51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification51.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification51 obj) throws Exception {
			checkGenericIdentification51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification28
	 * GenericIdentification28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification28> forGenericIdentification28 = new MMConstraint<GenericIdentification28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GenericIdentification28.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification28 obj) throws Exception {
			checkGenericIdentification28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification25
	 * GenericIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification25> forGenericIdentification25 = new MMConstraint<GenericIdentification25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> GenericIdentification25.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification25 obj) throws Exception {
			checkGenericIdentification25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification19
	 * GenericIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification19> forGenericIdentification19 = new MMConstraint<GenericIdentification19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification19.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification19 obj) throws Exception {
			checkGenericIdentification19(obj);
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
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesCertificate2> forSecuritiesCertificate2 = new MMConstraint<SecuritiesCertificate2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName. In this message subset, a restricted data type was implemented to comply with this coexistence rule.";
			owner_lazy = () -> SecuritiesCertificate2.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesCertificate2 obj) throws Exception {
			checkSecuritiesCertificate2(obj);
		}
	};

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkGenericIdentification24(GenericIdentification24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkProprietaryQuantity5(ProprietaryQuantity5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification34(GenericIdentification34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkProprietaryQuantity3(ProprietaryQuantity3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification20(GenericIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkSecuritiesCertificate1(SecuritiesCertificate1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification22(GenericIdentification22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkProprietaryQuantity6(ProprietaryQuantity6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkProprietaryQuantity2(ProprietaryQuantity2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkProprietaryQuantity4(ProprietaryQuantity4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkGenericIdentification23(GenericIdentification23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification51(GenericIdentification51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkGenericIdentification28(GenericIdentification28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkGenericIdentification25(GenericIdentification25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification19(GenericIdentification19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName. In this message
	 * subset, a restricted data type was implemented to comply with this
	 * coexistence rule.
	 */
	public static void checkSecuritiesCertificate2(SecuritiesCertificate2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}