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
 * SMPG recommends that at least three settlement parties be instructed in
 * equity or fixed income receive<br>
 * free or against payment settlement instructions; the depository, the
 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
 * The data format for the identification of Party1 depends on the market. If no
 * country specific requirement is available, BIC is recommended.<br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSettlementChainGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties62
	 * ConstraintSettlementChainGuideline.forSettlementParties62}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties10
	 * ConstraintSettlementChainGuideline.forSettlementParties10}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties36> forSettlementParties36 = new MMConstraint<SettlementParties36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties62);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties10;
			owner_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties36 obj) throws Exception {
			checkSettlementParties36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties11
	 * SettlementParties11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties11> forSettlementParties11 = new MMConstraint<SettlementParties11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties11.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties11 obj) throws Exception {
			checkSettlementParties11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties36
	 * ConstraintSettlementChainGuideline.forSettlementParties36}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties62> forSettlementParties62 = new MMConstraint<SettlementParties62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties36;
			owner_lazy = () -> SettlementParties62.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties62 obj) throws Exception {
			checkSettlementParties62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties20
	 * SettlementParties20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties20> forSettlementParties20 = new MMConstraint<SettlementParties20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties20.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties20 obj) throws Exception {
			checkSettlementParties20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties27
	 * SettlementParties27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties27> forSettlementParties27 = new MMConstraint<SettlementParties27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties27.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties27 obj) throws Exception {
			checkSettlementParties27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties5
	 * SettlementParties5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties5> forSettlementParties5 = new MMConstraint<SettlementParties5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties5.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties5 obj) throws Exception {
			checkSettlementParties5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties18
	 * SettlementParties18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties18> forSettlementParties18 = new MMConstraint<SettlementParties18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties18.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties18 obj) throws Exception {
			checkSettlementParties18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties36
	 * ConstraintSettlementChainGuideline.forSettlementParties36}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties10> forSettlementParties10 = new MMConstraint<SettlementParties10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties36);
			owner_lazy = () -> SettlementParties10.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties10 obj) throws Exception {
			checkSettlementParties10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties14> forSettlementParties14 = new MMConstraint<SettlementParties14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties14.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties14 obj) throws Exception {
			checkSettlementParties14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties64
	 * SettlementParties64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties64> forSettlementParties64 = new MMConstraint<SettlementParties64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties64.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties64 obj) throws Exception {
			checkSettlementParties64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties17
	 * SettlementParties17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties17> forSettlementParties17 = new MMConstraint<SettlementParties17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties17.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties17 obj) throws Exception {
			checkSettlementParties17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties7
	 * SettlementParties7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties7> forSettlementParties7 = new MMConstraint<SettlementParties7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties7.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties7 obj) throws Exception {
			checkSettlementParties7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties44
	 * SettlementParties44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties44> forSettlementParties44 = new MMConstraint<SettlementParties44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties44.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties44 obj) throws Exception {
			checkSettlementParties44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties26
	 * SettlementParties26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementChainGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementParties26> forSettlementParties26 = new MMConstraint<SettlementParties26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementChainGuideline";
			definition = "SMPG recommends that at least three settlement parties be instructed in equity or fixed income receive\r\nfree or against payment settlement instructions; the depository, the participant of the depository (Party1) and the client of Party1 (Party2).\r\nThe data format for the identification of Party1 depends on the market. If no country specific requirement is available, BIC is recommended.\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementParties26.mmObject();
		}

		@Override
		public void executeValidator(SettlementParties26 obj) throws Exception {
			checkSettlementParties26(obj);
		}
	};

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties36(SettlementParties36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties11(SettlementParties11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties62(SettlementParties62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties20(SettlementParties20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties27(SettlementParties27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties5(SettlementParties5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties18(SettlementParties18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties10(SettlementParties10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties14(SettlementParties14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties64(SettlementParties64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties17(SettlementParties17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties7(SettlementParties7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties44(SettlementParties44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * SMPG recommends that at least three settlement parties be instructed in
	 * equity or fixed income receive<br>
	 * free or against payment settlement instructions; the depository, the
	 * participant of the depository (Party1) and the client of Party1 (Party2).<br>
	 * The data format for the identification of Party1 depends on the market.
	 * If no country specific requirement is available, BIC is recommended.<br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementParties26(SettlementParties26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}