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
import com.tools20022.repository.codeset.OvernightIndexSwapType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of overnight index swap transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapType1Code#Paid
 * OvernightIndexSwapType1Code.Paid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapType1Code#Received
 * OvernightIndexSwapType1Code.Received}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapTypeCode
 * OvernightIndexSwapTypeCode}</li>
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
 * "OvernightIndexSwapType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of overnight index swap transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OvernightIndexSwapType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapType1Code
	 * OvernightIndexSwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paid"</li>
	 * </ul>
	 */
	public static final OvernightIndexSwapType1Code Paid = new OvernightIndexSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Paid";
			owner_lazy = () -> com.tools20022.repository.codeset.OvernightIndexSwapType1Code.mmObject();
			codeName = OvernightIndexSwapTypeCode.Paid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapType1Code
	 * OvernightIndexSwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final OvernightIndexSwapType1Code Received = new OvernightIndexSwapType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.OvernightIndexSwapType1Code.mmObject();
			codeName = OvernightIndexSwapTypeCode.Received.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OvernightIndexSwapType1Code> codesByName = new LinkedHashMap<>();

	protected OvernightIndexSwapType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OvernightIndexSwapType1Code";
				definition = "Specifies the type of overnight index swap transaction.";
				trace_lazy = () -> OvernightIndexSwapTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OvernightIndexSwapType1Code.Paid, com.tools20022.repository.codeset.OvernightIndexSwapType1Code.Received);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Paid.getCodeName().get(), Paid);
		codesByName.put(Received.getCodeName().get(), Received);
	}

	public static OvernightIndexSwapType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OvernightIndexSwapType1Code[] values() {
		OvernightIndexSwapType1Code[] values = new OvernightIndexSwapType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OvernightIndexSwapType1Code> {
		@Override
		public OvernightIndexSwapType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OvernightIndexSwapType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}