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
import com.tools20022.repository.codeset.AutoBorrowing2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the condition under which automatic borrowing is allowed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code#LastResort
 * AutoBorrowing2Code.LastResort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code#NoAutomatic
 * AutoBorrowing2Code.NoAutomatic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code#Automatic
 * AutoBorrowing2Code.Automatic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code#Return
 * AutoBorrowing2Code.Return}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
 * AutoBorrowingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LAMI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AutoBorrowing2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the condition under which automatic borrowing is allowed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AutoBorrowing2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code
	 * AutoBorrowing2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastResort"</li>
	 * </ul>
	 */
	public static final AutoBorrowing2Code LastResort = new AutoBorrowing2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastResort";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowing2Code.mmObject();
			codeName = AutoBorrowingCode.LastResort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code
	 * AutoBorrowing2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAutomatic"</li>
	 * </ul>
	 */
	public static final AutoBorrowing2Code NoAutomatic = new AutoBorrowing2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAutomatic";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowing2Code.mmObject();
			codeName = AutoBorrowingCode.NoAutomatic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code
	 * AutoBorrowing2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Automatic"</li>
	 * </ul>
	 */
	public static final AutoBorrowing2Code Automatic = new AutoBorrowing2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Automatic";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowing2Code.mmObject();
			codeName = AutoBorrowingCode.Automatic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowing2Code
	 * AutoBorrowing2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * </ul>
	 */
	public static final AutoBorrowing2Code Return = new AutoBorrowing2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			owner_lazy = () -> com.tools20022.repository.codeset.AutoBorrowing2Code.mmObject();
			codeName = AutoBorrowingCode.Return.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AutoBorrowing2Code> codesByName = new LinkedHashMap<>();

	protected AutoBorrowing2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LAMI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutoBorrowing2Code";
				definition = "Specifies the condition under which automatic borrowing is allowed.";
				trace_lazy = () -> AutoBorrowingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AutoBorrowing2Code.LastResort, com.tools20022.repository.codeset.AutoBorrowing2Code.NoAutomatic,
						com.tools20022.repository.codeset.AutoBorrowing2Code.Automatic, com.tools20022.repository.codeset.AutoBorrowing2Code.Return);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LastResort.getCodeName().get(), LastResort);
		codesByName.put(NoAutomatic.getCodeName().get(), NoAutomatic);
		codesByName.put(Automatic.getCodeName().get(), Automatic);
		codesByName.put(Return.getCodeName().get(), Return);
	}

	public static AutoBorrowing2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AutoBorrowing2Code[] values() {
		AutoBorrowing2Code[] values = new AutoBorrowing2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AutoBorrowing2Code> {
		@Override
		public AutoBorrowing2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AutoBorrowing2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}