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
import com.tools20022.repository.codeset.BrokeredDeal1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code#BilateralTransaction
 * BrokeredDeal1Code.BilateralTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code#BrokeredTransaction
 * BrokeredDeal1Code.BrokeredTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BrokeredDealCode
 * BrokeredDealCode}</li>
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
 * "BrokeredDeal1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the transaction is arranged via a third party broker or not."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BrokeredDeal1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code
	 * BrokeredDeal1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralTransaction"</li>
	 * </ul>
	 */
	public static final BrokeredDeal1Code BilateralTransaction = new BrokeredDeal1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.BrokeredDeal1Code.mmObject();
			codeName = BrokeredDealCode.BilateralTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code
	 * BrokeredDeal1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokeredTransaction"</li>
	 * </ul>
	 */
	public static final BrokeredDeal1Code BrokeredTransaction = new BrokeredDeal1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeredTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.BrokeredDeal1Code.mmObject();
			codeName = BrokeredDealCode.BrokeredTransaction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BrokeredDeal1Code> codesByName = new LinkedHashMap<>();

	protected BrokeredDeal1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BrokeredDeal1Code";
				definition = "Specifies whether the transaction is arranged via a third party broker or not.";
				trace_lazy = () -> BrokeredDealCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BrokeredDeal1Code.BilateralTransaction, com.tools20022.repository.codeset.BrokeredDeal1Code.BrokeredTransaction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BilateralTransaction.getCodeName().get(), BilateralTransaction);
		codesByName.put(BrokeredTransaction.getCodeName().get(), BrokeredTransaction);
	}

	public static BrokeredDeal1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BrokeredDeal1Code[] values() {
		BrokeredDeal1Code[] values = new BrokeredDeal1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BrokeredDeal1Code> {
		@Override
		public BrokeredDeal1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BrokeredDeal1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}