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
 * • Physical settlement:<br>
 * In case of physical receipt at local agent level, the receiving agent must
 * receive a receipt free instruction<br>
 * for reconciliation purposes. If the final beneficiary of the securities uses
 * a global custodian, the receipt free<br>
 * instruction will be sent to the global custodian that will forward it to his
 * receiving agent on the market.<br>
 * For physical settlement, SettlementTransactionCondition/Physical must be
 * used.<br>
 * • Partial settlement:<br>
 * This market practice only applies in markets where partial settlement is
 * allowed.<br>
 * If an account owner wants to specify in its original instruction that partial
 * settlement is allowed or not, they<br>
 * must use the PartialSettlementIndicator.<br>
 * • Book Transfer:<br>
 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
 * booktransfer<br>
 * related fields is governed by a market practice document.<br>
 * • Block Trades:<br>
 * The parent transaction must be identified using the BloclTrade field with
 * code BLPA. The children<br>
 * transactions must be identified using the code BLCH.<br>
 * <br>
 * For more details, see the relevant market practice document on www.smpg.info.
 */
public class ConstraintSettlementParametersGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1
	 * SettlementDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails1> forSettlementDetails1 = new MMConstraint<SettlementDetails1>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19
	 * SettlementDetails19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails19> forSettlementDetails19 = new MMConstraint<SettlementDetails19>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22
	 * SettlementDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails22> forSettlementDetails22 = new MMConstraint<SettlementDetails22>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35
	 * SettlementDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails35> forSettlementDetails35 = new MMConstraint<SettlementDetails35>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42
	 * SettlementDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails67
	 * ConstraintSettlementParametersGuideline.forSettlementDetails67}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails42> forSettlementDetails42 = new MMConstraint<SettlementDetails42>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails67);
			owner_lazy = () -> SettlementDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52
	 * SettlementDetails52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails52> forSettlementDetails52 = new MMConstraint<SettlementDetails52>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails52.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails43> forSettlementDetails43 = new MMConstraint<SettlementDetails43>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails43.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67
	 * SettlementDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails93
	 * ConstraintSettlementParametersGuideline.forSettlementDetails93}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails42
	 * ConstraintSettlementParametersGuideline.forSettlementDetails42}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails67> forSettlementDetails67 = new MMConstraint<SettlementDetails67>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails93);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails42;
			owner_lazy = () -> SettlementDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81
	 * SettlementDetails81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails81> forSettlementDetails81 = new MMConstraint<SettlementDetails81>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails81;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails81.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93
	 * SettlementDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails101
	 * ConstraintSettlementParametersGuideline.forSettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails119
	 * ConstraintSettlementParametersGuideline.forSettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails140
	 * ConstraintSettlementParametersGuideline.forSettlementDetails140}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails67
	 * ConstraintSettlementParametersGuideline.forSettlementDetails67}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails93> forSettlementDetails93 = new MMConstraint<SettlementDetails93>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails101,
					com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails119, com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails140);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails67;
			owner_lazy = () -> SettlementDetails93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101
	 * SettlementDetails101}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails120
	 * ConstraintSettlementParametersGuideline.forSettlementDetails120}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails93
	 * ConstraintSettlementParametersGuideline.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails101> forSettlementDetails101 = new MMConstraint<SettlementDetails101>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails101;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails120);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails101.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111
	 * SettlementDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails111> forSettlementDetails111 = new MMConstraint<SettlementDetails111>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112
	 * SettlementDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails112> forSettlementDetails112 = new MMConstraint<SettlementDetails112>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails112.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120
	 * SettlementDetails120}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails145
	 * ConstraintSettlementParametersGuideline.forSettlementDetails145}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails101
	 * ConstraintSettlementParametersGuideline.forSettlementDetails101}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails120> forSettlementDetails120 = new MMConstraint<SettlementDetails120>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails120;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails145);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails101;
			owner_lazy = () -> SettlementDetails120.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119
	 * SettlementDetails119}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails142
	 * ConstraintSettlementParametersGuideline.forSettlementDetails142}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails93
	 * ConstraintSettlementParametersGuideline.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails119> forSettlementDetails119 = new MMConstraint<SettlementDetails119>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails119;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails142);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails119.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137
	 * SettlementDetails137}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails137> forSettlementDetails137 = new MMConstraint<SettlementDetails137>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails137;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails137.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132
	 * SettlementDetails132}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails132> forSettlementDetails132 = new MMConstraint<SettlementDetails132>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails132;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails132.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140
	 * SettlementDetails140}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails93
	 * ConstraintSettlementParametersGuideline.forSettlementDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails140> forSettlementDetails140 = new MMConstraint<SettlementDetails140>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails140;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails93;
			owner_lazy = () -> SettlementDetails140.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142
	 * SettlementDetails142}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails119
	 * ConstraintSettlementParametersGuideline.forSettlementDetails119}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails142> forSettlementDetails142 = new MMConstraint<SettlementDetails142>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails142;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails119;
			owner_lazy = () -> SettlementDetails142.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145
	 * SettlementDetails145}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline#forSettlementDetails120
	 * ConstraintSettlementParametersGuideline.forSettlementDetails120}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails145> forSettlementDetails145 = new MMConstraint<SettlementDetails145>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails145;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintSettlementParametersGuideline.forSettlementDetails120;
			owner_lazy = () -> SettlementDetails145.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156
	 * SettlementDetails156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails156> forSettlementDetails156 = new MMConstraint<SettlementDetails156>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails156;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails156.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157
	 * SettlementDetails157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParametersGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails157> forSettlementDetails157 = new MMConstraint<SettlementDetails157>() {
		{
			validator = ConstraintSettlementParametersGuideline::checkSettlementDetails157;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParametersGuideline";
			definition = "• Physical settlement:\r\nIn case of physical receipt at local agent level, the receiving agent must receive a receipt free instruction\r\nfor reconciliation purposes. If the final beneficiary of the securities uses a global custodian, the receipt free\r\ninstruction will be sent to the global custodian that will forward it to his receiving agent on the market.\r\nFor physical settlement, SettlementTransactionCondition/Physical must be used.\r\n• Partial settlement:\r\nThis market practice only applies in markets where partial settlement is allowed.\r\nIf an account owner wants to specify in its original instruction that partial settlement is allowed or not, they\r\nmust use the PartialSettlementIndicator.\r\n• Book Transfer:\r\nThe use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other booktransfer\r\nrelated fields is governed by a market practice document.\r\n• Block Trades:\r\nThe parent transaction must be identified using the BloclTrade field with code BLPA. The children\r\ntransactions must be identified using the code BLCH.\r\n\r\nFor more details, see the relevant market practice document on www.smpg.info.";
			owner_lazy = () -> SettlementDetails157.mmObject();
		}
	};

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails1(SettlementDetails1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails19(SettlementDetails19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails22(SettlementDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails35(SettlementDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails42(SettlementDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails52(SettlementDetails52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails43(SettlementDetails43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails67(SettlementDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails81(SettlementDetails81 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails93(SettlementDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails101(SettlementDetails101 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails111(SettlementDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails112(SettlementDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails120(SettlementDetails120 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails119(SettlementDetails119 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails137(SettlementDetails137 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails132(SettlementDetails132 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails140(SettlementDetails140 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails142(SettlementDetails142 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails145(SettlementDetails145 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails156(SettlementDetails156 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * • Physical settlement:<br>
	 * In case of physical receipt at local agent level, the receiving agent
	 * must receive a receipt free instruction<br>
	 * for reconciliation purposes. If the final beneficiary of the securities
	 * uses a global custodian, the receipt free<br>
	 * instruction will be sent to the global custodian that will forward it to
	 * his receiving agent on the market.<br>
	 * For physical settlement, SettlementTransactionCondition/Physical must be
	 * used.<br>
	 * • Partial settlement:<br>
	 * This market practice only applies in markets where partial settlement is
	 * allowed.<br>
	 * If an account owner wants to specify in its original instruction that
	 * partial settlement is allowed or not, they<br>
	 * must use the PartialSettlementIndicator.<br>
	 * • Book Transfer:<br>
	 * The use of SecuritiesTransactionTypes OWNI, OWNE, INSP and PORT and other
	 * booktransfer<br>
	 * related fields is governed by a market practice document.<br>
	 * • Block Trades:<br>
	 * The parent transaction must be identified using the BloclTrade field with
	 * code BLPA. The children<br>
	 * transactions must be identified using the code BLCH.<br>
	 * <br>
	 * For more details, see the relevant market practice document on
	 * www.smpg.info.
	 */
	public static void checkSettlementDetails157(SettlementDetails157 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}