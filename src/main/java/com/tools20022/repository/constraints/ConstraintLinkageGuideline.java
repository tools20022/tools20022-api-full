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
import com.tools20022.repository.area.sese.*;
import java.util.Arrays;

/**
 * Global market practice rules on the use of the linkages exists for various
 * business scenarios such as cancellations, settlement confirmation but also
 * more complex processes like pair-off, back-to-back, block trades, sell-buy
 * back, buy-sell back, securities lending and borrowing.<br>
 * For more details, see the relevant market practice documents on
 * www.smpg.info.
 */
public class ConstraintLinkageGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> forSecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV08
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkageGuideline#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintLinkageGuideline.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintLinkageGuideline.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkageGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintLinkageGuideline::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkageGuideline";
			definition = "Global market practice rules on the use of the linkages exists for various business scenarios such as cancellations, settlement confirmation but also more complex processes like pair-off, back-to-back, block trades, sell-buy back, buy-sell back, securities lending and borrowing, etc.\r\nFor more details, see the relevant market practice documents on www.smpg.info.";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}
	};

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Global market practice rules on the use of the linkages exists for
	 * various business scenarios such as cancellations, settlement confirmation
	 * but also more complex processes like pair-off, back-to-back, block
	 * trades, sell-buy back, buy-sell back, securities lending and borrowing,
	 * etc.<br>
	 * For more details, see the relevant market practice documents on
	 * www.smpg.info.
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}