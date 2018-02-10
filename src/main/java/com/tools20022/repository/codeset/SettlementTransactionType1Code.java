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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettlementTransactionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies underlying information about the settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#TradeSettlement
 * SettlementTransactionType1Code.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#WithdrawalSubAccount
 * SettlementTransactionType1Code.WithdrawalSubAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#Reporting
 * SettlementTransactionType1Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#ExternalOwnAccount
 * SettlementTransactionType1Code.ExternalOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#InternalOwnAccount
 * SettlementTransactionType1Code.InternalOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#Turnaround
 * SettlementTransactionType1Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#Pairoff
 * SettlementTransactionType1Code.Pairoff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#Placement
 * SettlementTransactionType1Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#RepurchaseAgreement
 * SettlementTransactionType1Code.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#SecuritiesLending
 * SettlementTransactionType1Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#Collateral
 * SettlementTransactionType1Code.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#BuySellBackOpening
 * SettlementTransactionType1Code.BuySellBackOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#BuySellBackClosure
 * SettlementTransactionType1Code.BuySellBackClosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#BlockTradeChild
 * SettlementTransactionType1Code.BlockTradeChild}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType1Code#BlockTradeParent
 * SettlementTransactionType1Code.BlockTradeParent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::SETR</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionType1Code extends MMCode {

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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//TRAD</li>
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
	public static final SettlementTransactionType1Code TradeSettlement = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//TRAD"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "TradeSettlement";
			definition = "Transaction relates to the settlement of a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//REDI</li>
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
	public static final SettlementTransactionType1Code WithdrawalSubAccount = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//REDI"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "WithdrawalSubAccount";
			definition = "Transaction involves the withdrawal of specified amounts from specified sub-accounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//RPTO</li>
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
	public static final SettlementTransactionType1Code Reporting = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//RPTO"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Reporting";
			definition = "Transaction is for reporting purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//OWNE</li>
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
	public static final SettlementTransactionType1Code ExternalOwnAccount = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//OWNE"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ExternalOwnAccount";
			definition = "Transaction is an external account transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//OWNI</li>
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
	public static final SettlementTransactionType1Code InternalOwnAccount = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//OWNI"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InternalOwnAccount";
			definition = "Transaction is an own account transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//TURN</li>
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
	public static final SettlementTransactionType1Code Turnaround = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//TURN"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Turnaround";
			definition = "Transaction is part of a turnaround.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//PAIR</li>
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
	public static final SettlementTransactionType1Code Pairoff = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//PAIR"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Pairoff";
			definition = "Transaction is part of a pairoff.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//PLAC</li>
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
	public static final SettlementTransactionType1Code Placement = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//PLAC"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Placement";
			definition = "Transaction is part of a placement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//REPU</li>
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
	public static final SettlementTransactionType1Code RepurchaseAgreement = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//REPU"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "RepurchaseAgreement";
			definition = "Transaction relates to a repo or reverse repo.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//SECL</li>
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
	public static final SettlementTransactionType1Code SecuritiesLending = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//SECL"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SecuritiesLending";
			definition = "Transaction is part of a securities lending operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//COLL</li>
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
	public static final SettlementTransactionType1Code Collateral = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//COLL"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Collateral";
			definition = "Transaction relates to collateral in the form of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//BSBO</li>
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
	public static final SettlementTransactionType1Code BuySellBackOpening = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//BSBO"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BuySellBackOpening";
			definition = "Transaction relates to a buy sell back opening leg.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//BSBC</li>
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
	public static final SettlementTransactionType1Code BuySellBackClosure = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//BSBC"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BuySellBackClosure";
			definition = "Transaction relates to a buy sell back closing leg.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//BLCH</li>
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
	public static final SettlementTransactionType1Code BlockTradeChild = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//BLCH"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BlockTradeChild";
			definition = "Transaction relates to a block trade child.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SETR//BLPA</li>
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
	public static final SettlementTransactionType1Code BlockTradeParent = new SettlementTransactionType1Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR//BLPA"));
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "BlockTradeParent";
			definition = "Transaction relates to a block trade parent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType1Code.mmObject();
			codeName = "BLPA";
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionType1Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SETR"));
				example = Arrays.asList("TRAD");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "SettlementTransactionType1Code";
				definition = "Specifies underlying information about the settlement transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionType1Code.TradeSettlement, com.tools20022.repository.codeset.SettlementTransactionType1Code.WithdrawalSubAccount,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.Reporting, com.tools20022.repository.codeset.SettlementTransactionType1Code.ExternalOwnAccount,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.InternalOwnAccount, com.tools20022.repository.codeset.SettlementTransactionType1Code.Turnaround,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.Pairoff, com.tools20022.repository.codeset.SettlementTransactionType1Code.Placement,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.RepurchaseAgreement, com.tools20022.repository.codeset.SettlementTransactionType1Code.SecuritiesLending,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.Collateral, com.tools20022.repository.codeset.SettlementTransactionType1Code.BuySellBackOpening,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.BuySellBackClosure, com.tools20022.repository.codeset.SettlementTransactionType1Code.BlockTradeChild,
						com.tools20022.repository.codeset.SettlementTransactionType1Code.BlockTradeParent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TradeSettlement.getCodeName().get(), TradeSettlement);
		codesByName.put(WithdrawalSubAccount.getCodeName().get(), WithdrawalSubAccount);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(ExternalOwnAccount.getCodeName().get(), ExternalOwnAccount);
		codesByName.put(InternalOwnAccount.getCodeName().get(), InternalOwnAccount);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(Pairoff.getCodeName().get(), Pairoff);
		codesByName.put(Placement.getCodeName().get(), Placement);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(Collateral.getCodeName().get(), Collateral);
		codesByName.put(BuySellBackOpening.getCodeName().get(), BuySellBackOpening);
		codesByName.put(BuySellBackClosure.getCodeName().get(), BuySellBackClosure);
		codesByName.put(BlockTradeChild.getCodeName().get(), BlockTradeChild);
		codesByName.put(BlockTradeParent.getCodeName().get(), BlockTradeParent);
	}

	public static SettlementTransactionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionType1Code[] values() {
		SettlementTransactionType1Code[] values = new SettlementTransactionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionType1Code> {
		@Override
		public SettlementTransactionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}