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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies underlying information about the settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmTradeSettlement
 * SettlementTransactionType1Code.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmWithdrawalSubAccount
 * SettlementTransactionType1Code.mmWithdrawalSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmReporting
 * SettlementTransactionType1Code.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmExternalOwnAccount
 * SettlementTransactionType1Code.mmExternalOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmInternalOwnAccount
 * SettlementTransactionType1Code.mmInternalOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmTurnaround
 * SettlementTransactionType1Code.mmTurnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmPairoff
 * SettlementTransactionType1Code.mmPairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmPlacement
 * SettlementTransactionType1Code.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmRepurchaseAgreement
 * SettlementTransactionType1Code.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmSecuritiesLending
 * SettlementTransactionType1Code.mmSecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmCollateral
 * SettlementTransactionType1Code.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmBuySellBackOpening
 * SettlementTransactionType1Code.mmBuySellBackOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmBuySellBackClosure
 * SettlementTransactionType1Code.mmBuySellBackClosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmBlockTradeChild
 * SettlementTransactionType1Code.mmBlockTradeChild}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#mmBlockTradeParent
 * SettlementTransactionType1Code.mmBlockTradeParent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TRAD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information about the settlement transaction."</li>
 * </ul>
 */
public class SettlementTransactionType1Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction relates to the settlement of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to the settlement of a trade."</li>
	 * </ul>
	 */
	public static final MMCode mmTradeSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TradeSettlement";
			definition = "Transaction relates to the settlement of a trade.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Transaction involves the withdrawal of specified amounts from specified
	 * sub-accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalSubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction involves the withdrawal of specified amounts from specified sub-accounts."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalSubAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "WithdrawalSubAccount";
			definition = "Transaction involves the withdrawal of specified amounts from specified sub-accounts.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "REDI";
		}
	};
	/**
	 * Transaction is for reporting purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is for reporting purposes only."</li>
	 * </ul>
	 */
	public static final MMCode mmReporting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Reporting";
			definition = "Transaction is for reporting purposes only.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Transaction is an external account transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an external account transfer."</li>
	 * </ul>
	 */
	public static final MMCode mmExternalOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ExternalOwnAccount";
			definition = "Transaction is an external account transfer.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Transaction is an own account transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an own account transfer."</li>
	 * </ul>
	 */
	public static final MMCode mmInternalOwnAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InternalOwnAccount";
			definition = "Transaction is an own account transfer.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "OWNI";
		}
	};
	/**
	 * Transaction is part of a turnaround.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TURN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is part of a turnaround."</li>
	 * </ul>
	 */
	public static final MMCode mmTurnaround = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Turnaround";
			definition = "Transaction is part of a turnaround.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "TURN";
		}
	};
	/**
	 * Transaction is part of a pairoff.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pairoff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is part of a pairoff."</li>
	 * </ul>
	 */
	public static final MMCode mmPairoff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Pairoff";
			definition = "Transaction is part of a pairoff.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Transaction is part of a placement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is part of a placement."</li>
	 * </ul>
	 */
	public static final MMCode mmPlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Placement";
			definition = "Transaction is part of a placement.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Transaction relates to a repo or reverse repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to a repo or reverse repo."</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "RepurchaseAgreement";
			definition = "Transaction relates to a repo or reverse repo.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Transaction is part of a securities lending operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is part of a securities lending operation."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesLending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SecuritiesLending";
			definition = "Transaction is part of a securities lending operation.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "SECL";
		}
	};
	/**
	 * Transaction relates to collateral in the form of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction relates to collateral in the form of securities."</li>
	 * </ul>
	 */
	public static final MMCode mmCollateral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Collateral";
			definition = "Transaction relates to collateral in the form of securities.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Transaction relates to a buy sell back opening leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBackOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to a buy sell back opening leg."</li>
	 * </ul>
	 */
	public static final MMCode mmBuySellBackOpening = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BuySellBackOpening";
			definition = "Transaction relates to a buy sell back opening leg.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "BSBO";
		}
	};
	/**
	 * Transaction relates to a buy sell back closing leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSBC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBackClosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to a buy sell back closing leg."</li>
	 * </ul>
	 */
	public static final MMCode mmBuySellBackClosure = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BuySellBackClosure";
			definition = "Transaction relates to a buy sell back closing leg.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "BSBC";
		}
	};
	/**
	 * Transaction relates to a block trade child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTradeChild"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to a block trade child."</li>
	 * </ul>
	 */
	public static final MMCode mmBlockTradeChild = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BlockTradeChild";
			definition = "Transaction relates to a block trade child.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "BLCH";
		}
	};
	/**
	 * Transaction relates to a block trade parent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code
	 * SettlementTransactionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTradeParent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to a block trade parent."</li>
	 * </ul>
	 */
	public static final MMCode mmBlockTradeParent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BlockTradeParent";
			definition = "Transaction relates to a block trade parent.";
			owner_lazy = () -> SettlementTransactionType1Code.mmObject();
			codeName = "BLPA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TRAD");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "SettlementTransactionType1Code";
				definition = "Specifies underlying information about the settlement transaction.";
				code_lazy = () -> Arrays.asList(SettlementTransactionType1Code.mmTradeSettlement, SettlementTransactionType1Code.mmWithdrawalSubAccount, SettlementTransactionType1Code.mmReporting,
						SettlementTransactionType1Code.mmExternalOwnAccount, SettlementTransactionType1Code.mmInternalOwnAccount, SettlementTransactionType1Code.mmTurnaround, SettlementTransactionType1Code.mmPairoff,
						SettlementTransactionType1Code.mmPlacement, SettlementTransactionType1Code.mmRepurchaseAgreement, SettlementTransactionType1Code.mmSecuritiesLending, SettlementTransactionType1Code.mmCollateral,
						SettlementTransactionType1Code.mmBuySellBackOpening, SettlementTransactionType1Code.mmBuySellBackClosure, SettlementTransactionType1Code.mmBlockTradeChild, SettlementTransactionType1Code.mmBlockTradeParent);
			}
		});
		return mmObject_lazy.get();
	}
}