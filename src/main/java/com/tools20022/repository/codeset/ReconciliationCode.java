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
import com.tools20022.repository.codeset.ReconciliationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the process type used for the trade repository reconciliation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#NotSubmittedToReconciliation
 * ReconciliationCode.NotSubmittedToReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#SingleSidedEEAUnpaired
 * ReconciliationCode.SingleSidedEEAUnpaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#SingleSidedEEAPaired
 * ReconciliationCode.SingleSidedEEAPaired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#SingleSidedEEAMatched
 * ReconciliationCode.SingleSidedEEAMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#DualSidedNonMatched
 * ReconciliationCode.DualSidedNonMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#DualSidedMatched
 * ReconciliationCode.DualSidedMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode#SingleSidedNonEEA
 * ReconciliationCode.SingleSidedNonEEA}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Reconciliation1Code
 * Reconciliation1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReconciliationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the process type used for the trade repository reconciliation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReconciliationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade was not required to be submitted for reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSubmittedToReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade was not required to be submitted for reconciliation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode NotSubmittedToReconciliation = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSubmittedToReconciliation";
			definition = "Trade was not required to be submitted for reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "NORE";
		}
	};
	/**
	 * Trade repository has one side of the trade, knows that the other side is
	 * EEA counterparty and does not know which TR holds the other side of the
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSUN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAUnpaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has one side of the trade, knows that the other side is EEA counterparty and does not know which TR holds the other side of the trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode SingleSidedEEAUnpaired = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAUnpaired";
			definition = "Trade repository has one side of the trade, knows that the other side is EEA counterparty and does not know which TR holds the other side of the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "SSUN";
		}
	};
	/**
	 * Trade repository has one side of the trade, knows which trade repository
	 * holds the other side of the trade, and either has already performed
	 * comparison of the reports, or is in the process of doing so.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAPaired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, and either has already performed comparison of the reports, or is in the process of doing so."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode SingleSidedEEAPaired = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAPaired";
			definition = "Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, and either has already performed comparison of the reports, or is in the process of doing so.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "SSPA";
		}
	};
	/**
	 * Trade repository has one side of the trade, knows which trade repository
	 * holds the other side of the trade, has already performed the comparison
	 * of the reports, and the result has been successful according to the
	 * specification of the inter-TR reconciliation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSMA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedEEAMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, and the result has been successful according to the specification of the inter-TR reconciliation process."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode SingleSidedEEAMatched = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedEEAMatched";
			definition = "Trade repository has one side of the trade, knows which trade repository holds the other side of the trade, has already performed the comparison of the reports, and the result has been successful according to the specification of the inter-TR reconciliation process.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "SSMA";
		}
	};
	/**
	 * Trade repository has both sides of the trade reported but not all fields
	 * match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSNM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualSidedNonMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has both sides of the trade reported but not all fields match."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode DualSidedNonMatched = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualSidedNonMatched";
			definition = "Trade repository has both sides of the trade reported but not all fields match.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "DSNM";
		}
	};
	/**
	 * Trade repository has both sides of the trade reported and all fields
	 * match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSMA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualSidedMatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has both sides of the trade reported and all fields match."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode DualSidedMatched = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DualSidedMatched";
			definition = "Trade repository has both sides of the trade reported and all fields match.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "DSMA";
		}
	};
	/**
	 * Trade repository has one side of the trade and knows that the other side
	 * does not have a reporting obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReconciliationCode
	 * ReconciliationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSNE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleSidedNonEEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade repository has one side of the trade and knows that the other side does not have a reporting obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ReconciliationCode SingleSidedNonEEA = new ReconciliationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleSidedNonEEA";
			definition = "Trade repository has one side of the trade and knows that the other side does not have a reporting obligation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReconciliationCode.mmObject();
			codeName = "SSNE";
		}
	};
	final static private LinkedHashMap<String, ReconciliationCode> codesByName = new LinkedHashMap<>();

	protected ReconciliationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReconciliationCode";
				definition = "Specifies the process type used for the trade repository reconciliation.";
				derivation_lazy = () -> Arrays.asList(Reconciliation1Code.mmObject());
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.ReconciliationCode.NotSubmittedToReconciliation, com.tools20022.repository.codeset.ReconciliationCode.SingleSidedEEAUnpaired,
								com.tools20022.repository.codeset.ReconciliationCode.SingleSidedEEAPaired, com.tools20022.repository.codeset.ReconciliationCode.SingleSidedEEAMatched,
								com.tools20022.repository.codeset.ReconciliationCode.DualSidedNonMatched, com.tools20022.repository.codeset.ReconciliationCode.DualSidedMatched,
								com.tools20022.repository.codeset.ReconciliationCode.SingleSidedNonEEA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotSubmittedToReconciliation.getCodeName().get(), NotSubmittedToReconciliation);
		codesByName.put(SingleSidedEEAUnpaired.getCodeName().get(), SingleSidedEEAUnpaired);
		codesByName.put(SingleSidedEEAPaired.getCodeName().get(), SingleSidedEEAPaired);
		codesByName.put(SingleSidedEEAMatched.getCodeName().get(), SingleSidedEEAMatched);
		codesByName.put(DualSidedNonMatched.getCodeName().get(), DualSidedNonMatched);
		codesByName.put(DualSidedMatched.getCodeName().get(), DualSidedMatched);
		codesByName.put(SingleSidedNonEEA.getCodeName().get(), SingleSidedNonEEA);
	}

	public static ReconciliationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReconciliationCode[] values() {
		ReconciliationCode[] values = new ReconciliationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReconciliationCode> {
		@Override
		public ReconciliationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReconciliationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}