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
import com.tools20022.repository.codeset.ChargeBearer1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code#BorneByDebtor
 * ChargeBearer1Code.BorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code#BorneByCreditor
 * ChargeBearer1Code.BorneByCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearer1Code#Shared
 * ChargeBearer1Code.Shared}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
 * ChargeBearerCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearer1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which party(ies) will pay charges due for processing of the payment transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearer1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * </ul>
	 */
	public static final ChargeBearer1Code BorneByDebtor = new ChargeBearer1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearer1Code.mmObject();
			codeName = ChargeBearerCode.BorneByDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * </ul>
	 */
	public static final ChargeBearer1Code BorneByCreditor = new ChargeBearer1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearer1Code.mmObject();
			codeName = ChargeBearerCode.BorneByCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * </ul>
	 */
	public static final ChargeBearer1Code Shared = new ChargeBearer1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearer1Code.mmObject();
			codeName = ChargeBearerCode.Shared.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeBearer1Code> codesByName = new LinkedHashMap<>();

	protected ChargeBearer1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearer1Code";
				definition = "Specifies which party(ies) will pay charges due for processing of the payment transaction.";
				trace_lazy = () -> ChargeBearerCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearer1Code.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearer1Code.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearer1Code.Shared);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorneByDebtor.getCodeName().get(), BorneByDebtor);
		codesByName.put(BorneByCreditor.getCodeName().get(), BorneByCreditor);
		codesByName.put(Shared.getCodeName().get(), Shared);
	}

	public static ChargeBearer1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearer1Code[] values() {
		ChargeBearer1Code[] values = new ChargeBearer1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearer1Code> {
		@Override
		public ChargeBearer1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearer1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}