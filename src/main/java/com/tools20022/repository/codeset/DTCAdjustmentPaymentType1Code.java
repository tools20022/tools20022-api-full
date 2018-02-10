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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specified the type of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code#StockLoanPayment
 * DTCAdjustmentPaymentType1Code.StockLoanPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code#RepoPayment
 * DTCAdjustmentPaymentType1Code.RepoPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code#FailPayment
 * DTCAdjustmentPaymentType1Code.FailPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code#MiscellaneousPayment
 * DTCAdjustmentPaymentType1Code.MiscellaneousPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentTypeCode
 * DTCAdjustmentPaymentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specified the type of the payment adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
	 * DTCAdjustmentPaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType1Code StockLoanPayment = new DTCAdjustmentPaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeCode.StockLoanPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
	 * DTCAdjustmentPaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType1Code RepoPayment = new DTCAdjustmentPaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeCode.RepoPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
	 * DTCAdjustmentPaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType1Code FailPayment = new DTCAdjustmentPaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeCode.FailPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code
	 * DTCAdjustmentPaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentType1Code MiscellaneousPayment = new DTCAdjustmentPaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.mmObject();
			codeName = DTCAdjustmentPaymentTypeCode.MiscellaneousPayment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentType1Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentType1Code";
				definition = "Specified the type of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.StockLoanPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.RepoPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.FailPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentType1Code.MiscellaneousPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockLoanPayment.getCodeName().get(), StockLoanPayment);
		codesByName.put(RepoPayment.getCodeName().get(), RepoPayment);
		codesByName.put(FailPayment.getCodeName().get(), FailPayment);
		codesByName.put(MiscellaneousPayment.getCodeName().get(), MiscellaneousPayment);
	}

	public static DTCAdjustmentPaymentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentType1Code[] values() {
		DTCAdjustmentPaymentType1Code[] values = new DTCAdjustmentPaymentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentType1Code> {
		@Override
		public DTCAdjustmentPaymentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}