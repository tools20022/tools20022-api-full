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
 * Specifies the message type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmAccountingHoldings
 * MessageTypeCode.mmAccountingHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmCustodyHoldings
 * MessageTypeCode.mmCustodyHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmInvestmentFundTransactions
 * MessageTypeCode.mmInvestmentFundTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmEstimated
 * MessageTypeCode.mmEstimated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmEstimatedDetailed
 * MessageTypeCode.mmEstimatedDetailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmConfirmed
 * MessageTypeCode.mmConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmCornfirmedDetailed
 * MessageTypeCode.mmCornfirmedDetailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#mmTransparency
 * MessageTypeCode.mmTransparency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CashForecastMessage1Code
 * CashForecastMessage1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatementType1Code
 * StatementType1Code}</li>
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
 * <li>"ST03"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the message type."</li>
 * </ul>
 */
public class MessageTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Accounting Statement of Holdings (semt 003).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ST03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accounting Statement of Holdings (semt 003)."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountingHoldings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingHoldings";
			definition = "Accounting Statement of Holdings (semt 003).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "ST03";
		}
	};
	/**
	 * Custody Statement of Holdings (semt 002).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ST02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custody Statement of Holdings (semt 002)."</li>
	 * </ul>
	 */
	public static final MMCode mmCustodyHoldings = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyHoldings";
			definition = "Custody Statement of Holdings (semt 002).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "ST02";
		}
	};
	/**
	 * Statement of Investment Fund Transactions (semt 006).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ST06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement of Investment Fund Transactions (semt 006)."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentFundTransactions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactions";
			definition = "Statement of Investment Fund Transactions (semt 006).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "ST06";
		}
	};
	/**
	 * Fund estimated cash forecast report (camt.040).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF40"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund estimated cash forecast report (camt.040)."</li>
	 * </ul>
	 */
	public static final MMCode mmEstimated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			definition = "Fund estimated cash forecast report (camt.040).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "CF40";
		}
	};
	/**
	 * Fund detailed estimated cash forecast Report (042)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF42"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedDetailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund detailed estimated cash forecast Report (042)"</li>
	 * </ul>
	 */
	public static final MMCode mmEstimatedDetailed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedDetailed";
			definition = "Fund detailed estimated cash forecast Report (042)";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "CF42";
		}
	};
	/**
	 * Fund confirmed cash forecast report (camt.041).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF41"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund confirmed cash forecast report (camt.041)."</li>
	 * </ul>
	 */
	public static final MMCode mmConfirmed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Fund confirmed cash forecast report (camt.041).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "CF41";
		}
	};
	/**
	 * Fund detailed confirmed cash forecast report (camt.043)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF43"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CornfirmedDetailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund detailed confirmed cash forecast report (camt.043)"</li>
	 * </ul>
	 */
	public static final MMCode mmCornfirmedDetailed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CornfirmedDetailed";
			definition = "Fund detailed confirmed cash forecast report (camt.043)";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "CF43";
		}
	};
	/**
	 * Securities Balance Transparency (semt.041).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ST41"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transparency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities Balance Transparency (semt.041)."</li>
	 * </ul>
	 */
	public static final MMCode mmTransparency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transparency";
			definition = "Securities Balance Transparency (semt.041).";
			owner_lazy = () -> MessageTypeCode.mmObject();
			codeName = "ST41";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ST03");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageTypeCode";
				definition = "Specifies the message type.";
				code_lazy = () -> Arrays.asList(MessageTypeCode.mmAccountingHoldings, MessageTypeCode.mmCustodyHoldings, MessageTypeCode.mmInvestmentFundTransactions, MessageTypeCode.mmEstimated, MessageTypeCode.mmEstimatedDetailed,
						MessageTypeCode.mmConfirmed, MessageTypeCode.mmCornfirmedDetailed, MessageTypeCode.mmTransparency);
				derivation_lazy = () -> Arrays.asList(CashForecastMessage1Code.mmObject(), StatementType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}