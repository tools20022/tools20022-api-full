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
import com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of payment of a security at a particular time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code#FullyPaid
 * SecuritiesPaymentStatus1Code.FullyPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code#NillPaid
 * SecuritiesPaymentStatus1Code.NillPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code#PartiallyPaid
 * SecuritiesPaymentStatus1Code.PartiallyPaid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatusCode
 * SecuritiesPaymentStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22F::PAYS</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FULL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesPaymentStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of payment of a security at a particular time."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesPaymentStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyPaid"</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatus1Code FullyPaid = new SecuritiesPaymentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.mmObject();
			codeName = SecuritiesPaymentStatusCode.FullyPaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NillPaid"</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatus1Code NillPaid = new SecuritiesPaymentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NillPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.mmObject();
			codeName = SecuritiesPaymentStatusCode.NillPaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyPaid"</li>
	 * </ul>
	 */
	public static final SecuritiesPaymentStatus1Code PartiallyPaid = new SecuritiesPaymentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.mmObject();
			codeName = SecuritiesPaymentStatusCode.PartiallyPaid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesPaymentStatus1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesPaymentStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PAYS"));
				example = Arrays.asList("FULL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPaymentStatus1Code";
				definition = "Specifies the state of payment of a security at a particular time.";
				trace_lazy = () -> SecuritiesPaymentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.FullyPaid, com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.NillPaid,
						com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code.PartiallyPaid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FullyPaid.getCodeName().get(), FullyPaid);
		codesByName.put(NillPaid.getCodeName().get(), NillPaid);
		codesByName.put(PartiallyPaid.getCodeName().get(), PartiallyPaid);
	}

	public static SecuritiesPaymentStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesPaymentStatus1Code[] values() {
		SecuritiesPaymentStatus1Code[] values = new SecuritiesPaymentStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesPaymentStatus1Code> {
		@Override
		public SecuritiesPaymentStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesPaymentStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}