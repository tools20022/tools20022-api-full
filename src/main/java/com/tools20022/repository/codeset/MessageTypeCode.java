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
import com.tools20022.repository.codeset.MessageTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the message type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#AccountingHoldings
 * MessageTypeCode.AccountingHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#CustodyHoldings
 * MessageTypeCode.CustodyHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#InvestmentFundTransactions
 * MessageTypeCode.InvestmentFundTransactions}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageTypeCode#Estimated
 * MessageTypeCode.Estimated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#EstimatedDetailed
 * MessageTypeCode.EstimatedDetailed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageTypeCode#Confirmed
 * MessageTypeCode.Confirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#CornfirmedDetailed
 * MessageTypeCode.CornfirmedDetailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode#Transparency
 * MessageTypeCode.Transparency}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the message type."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageTypeCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accounting Statement of Holdings (semt 003)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode AccountingHoldings = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingHoldings";
			definition = "Accounting Statement of Holdings (semt 003).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custody Statement of Holdings (semt 002)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode CustodyHoldings = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyHoldings";
			definition = "Custody Statement of Holdings (semt 002).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement of Investment Fund Transactions (semt 006)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode InvestmentFundTransactions = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactions";
			definition = "Statement of Investment Fund Transactions (semt 006).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund estimated cash forecast report (camt.040)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode Estimated = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			definition = "Fund estimated cash forecast report (camt.040).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
			codeName = "CF40";
		}
	};
	/**
	 * Fund detailed estimated cash forecast Report (042).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF42"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedDetailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund detailed estimated cash forecast Report (042)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode EstimatedDetailed = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedDetailed";
			definition = "Fund detailed estimated cash forecast Report (042).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund confirmed cash forecast report (camt.041)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode Confirmed = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			definition = "Fund confirmed cash forecast report (camt.041).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
			codeName = "CF41";
		}
	};
	/**
	 * Fund detailed confirmed cash forecast report (camt.043).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageTypeCode
	 * MessageTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CF43"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CornfirmedDetailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund detailed confirmed cash forecast report (camt.043)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode CornfirmedDetailed = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CornfirmedDetailed";
			definition = "Fund detailed confirmed cash forecast report (camt.043).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transparency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities Balance Transparency (semt.041)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageTypeCode Transparency = new MessageTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transparency";
			definition = "Securities Balance Transparency (semt.041).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageTypeCode.mmObject();
			codeName = "ST41";
		}
	};
	final static private LinkedHashMap<String, MessageTypeCode> codesByName = new LinkedHashMap<>();

	protected MessageTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ST03");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageTypeCode";
				definition = "Specifies the message type.";
				derivation_lazy = () -> Arrays.asList(CashForecastMessage1Code.mmObject(), StatementType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageTypeCode.AccountingHoldings, com.tools20022.repository.codeset.MessageTypeCode.CustodyHoldings,
						com.tools20022.repository.codeset.MessageTypeCode.InvestmentFundTransactions, com.tools20022.repository.codeset.MessageTypeCode.Estimated, com.tools20022.repository.codeset.MessageTypeCode.EstimatedDetailed,
						com.tools20022.repository.codeset.MessageTypeCode.Confirmed, com.tools20022.repository.codeset.MessageTypeCode.CornfirmedDetailed, com.tools20022.repository.codeset.MessageTypeCode.Transparency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountingHoldings.getCodeName().get(), AccountingHoldings);
		codesByName.put(CustodyHoldings.getCodeName().get(), CustodyHoldings);
		codesByName.put(InvestmentFundTransactions.getCodeName().get(), InvestmentFundTransactions);
		codesByName.put(Estimated.getCodeName().get(), Estimated);
		codesByName.put(EstimatedDetailed.getCodeName().get(), EstimatedDetailed);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(CornfirmedDetailed.getCodeName().get(), CornfirmedDetailed);
		codesByName.put(Transparency.getCodeName().get(), Transparency);
	}

	public static MessageTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageTypeCode[] values() {
		MessageTypeCode[] values = new MessageTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageTypeCode> {
		@Override
		public MessageTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}