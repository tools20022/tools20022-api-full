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
import com.tools20022.repository.codeset.BrokeredDealCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the transaction is arranged via a third party broker or
 * not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BrokeredDealCode#BrokeredTransaction
 * BrokeredDealCode.BrokeredTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BrokeredDealCode#BilateralTransaction
 * BrokeredDealCode.BilateralTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code
 * BrokeredDeal1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BrokeredDealCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the transaction is arranged via a third party broker or not."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BrokeredDealCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction was arranged by a third party broking agent.<br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BrokeredDealCode
	 * BrokeredDealCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BROK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokeredTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction was arranged by a third party broking agent.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final BrokeredDealCode BrokeredTransaction = new BrokeredDealCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeredTransaction";
			definition = "Transaction was arranged by a third party broking agent.\r\n\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.BrokeredDealCode.mmObject();
			codeName = "BROK";
		}
	};
	/**
	 * Transaction was arranged directly by the reporting agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BrokeredDealCode
	 * BrokeredDealCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BILA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction was arranged directly by the reporting agent."
	 * </li>
	 * </ul>
	 */
	public static final BrokeredDealCode BilateralTransaction = new BrokeredDealCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralTransaction";
			definition = "Transaction was arranged directly by the reporting agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.BrokeredDealCode.mmObject();
			codeName = "BILA";
		}
	};
	final static private LinkedHashMap<String, BrokeredDealCode> codesByName = new LinkedHashMap<>();

	protected BrokeredDealCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BrokeredDealCode";
				definition = "Specifies whether the transaction is arranged via a third party broker or not.";
				derivation_lazy = () -> Arrays.asList(BrokeredDeal1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BrokeredDealCode.BrokeredTransaction, com.tools20022.repository.codeset.BrokeredDealCode.BilateralTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BrokeredTransaction.getCodeName().get(), BrokeredTransaction);
		codesByName.put(BilateralTransaction.getCodeName().get(), BilateralTransaction);
	}

	public static BrokeredDealCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BrokeredDealCode[] values() {
		BrokeredDealCode[] values = new BrokeredDealCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BrokeredDealCode> {
		@Override
		public BrokeredDealCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BrokeredDealCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}