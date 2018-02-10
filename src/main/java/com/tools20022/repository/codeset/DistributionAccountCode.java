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
import com.tools20022.repository.codeset.DistributionAccountCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account where the disbursed CUSIP will be allocated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionAccountCode#GeneralFree
 * DistributionAccountCode.GeneralFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionAccountCode#RRGAccount
 * DistributionAccountCode.RRGAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DistributionAccount1Code
 * DistributionAccount1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GENF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionAccountCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of account where the disbursed CUSIP will be allocated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionAccountCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * General free account. DTC (The Depository Trust Company) allows immediate
	 * use of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionAccountCode
	 * DistributionAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General free account. DTC (The Depository Trust Company) allows immediate use of securities."
	 * </li>
	 * </ul>
	 */
	public static final DistributionAccountCode GeneralFree = new DistributionAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralFree";
			definition = "General free account. DTC (The Depository Trust Company) allows immediate use of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionAccountCode.mmObject();
			codeName = "GENF";
		}
	};
	/**
	 * RRG account. Sub account. DTC (The Depository Trust Company) does not
	 * allow immediate use of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionAccountCode
	 * DistributionAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RRGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RRGAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "RRG account. Sub account. DTC (The Depository Trust Company)  does not allow immediate use of securities."
	 * </li>
	 * </ul>
	 */
	public static final DistributionAccountCode RRGAccount = new DistributionAccountCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RRGAccount";
			definition = "RRG account. Sub account. DTC (The Depository Trust Company)  does not allow immediate use of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionAccountCode.mmObject();
			codeName = "RRGA";
		}
	};
	final static private LinkedHashMap<String, DistributionAccountCode> codesByName = new LinkedHashMap<>();

	protected DistributionAccountCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionAccountCode";
				definition = "Specifies the type of account where the disbursed CUSIP will be allocated.";
				derivation_lazy = () -> Arrays.asList(DistributionAccount1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionAccountCode.GeneralFree, com.tools20022.repository.codeset.DistributionAccountCode.RRGAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GeneralFree.getCodeName().get(), GeneralFree);
		codesByName.put(RRGAccount.getCodeName().get(), RRGAccount);
	}

	public static DistributionAccountCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionAccountCode[] values() {
		DistributionAccountCode[] values = new DistributionAccountCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionAccountCode> {
		@Override
		public DistributionAccountCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionAccountCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}