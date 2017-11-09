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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Min3Max4Text;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party performing the card payment transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MerchantRole" src="doc-files/MerchantRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment13#mmMerchant
 * CardPaymentEnvironment13.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmMerchant
 * CardPaymentEnvironment14.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#mmMerchant
 * CardPaymentEnvironment9.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment12#mmMerchant
 * CardPaymentEnvironment12.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmMerchant
 * CardPaymentEnvironment10.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment18#mmMerchant
 * CardPaymentEnvironment18.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment24#mmMerchant
 * CardPaymentEnvironment24.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#mmMerchant
 * CardPaymentEnvironment20.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmMerchant
 * CardPaymentEnvironment27.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment26#mmMerchant
 * CardPaymentEnvironment26.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment23#mmMerchant
 * CardPaymentEnvironment23.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmMerchant
 * CardPaymentEnvironment22.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#mmMerchant
 * CardPaymentEnvironment32.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment36#mmMerchant
 * CardPaymentEnvironment36.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmMerchant
 * CardPaymentEnvironment40.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmMerchant
 * CardPaymentEnvironment34.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment35#mmMerchant
 * CardPaymentEnvironment35.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment39#mmMerchant
 * CardPaymentEnvironment39.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#mmMerchant
 * CardPaymentEnvironment52.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment49#mmMerchant
 * CardPaymentEnvironment49.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment51#mmMerchant
 * CardPaymentEnvironment51.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment48#mmMerchant
 * CardPaymentEnvironment48.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#mmMerchant
 * CardPaymentEnvironment45.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment54#mmMerchantIdentification
 * CardPaymentEnvironment54.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmMerchant
 * CardPaymentEnvironment53.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmMerchant
 * CardPaymentEnvironment47.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmMerchant
 * CardPaymentEnvironment61.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmMerchant
 * CardPaymentEnvironment60.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment66#mmMerchantIdentification
 * CardPaymentEnvironment66.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmMerchant
 * CardPaymentEnvironment62.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment58#mmMerchant
 * CardPaymentEnvironment58.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment59#mmMerchant
 * CardPaymentEnvironment59.mmMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmMerchant
 * CardPaymentEnvironment57.mmMerchant}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantCategoryCode
 * MerchantRole.mmMerchantCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MerchantRole#mmMerchantIdentification
 * MerchantRole.mmMerchantIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MerchantRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party performing the card payment transaction."</li>
 * </ul>
 */
public class MerchantRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Min3Max4Text merchantCategoryCode;
	/**
	 * Category code conform to ISO 18245, related to the type of services or
	 * goods the merchant provides for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min3Max4Text Min3Max4Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionDetails8#mmMerchantCategoryCode
	 * CardPaymentTransactionDetails8.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData1#mmMerchantCategoryCode
	 * CommonData1.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction4#mmMerchantCategoryCode
	 * CardPaymentTransaction4.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData2#mmMerchantCategoryCode
	 * CommonData2.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction14#mmMerchantCategoryCode
	 * CardPaymentTransaction14.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction7#mmMerchantCategoryCode
	 * CardPaymentTransaction7.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction16#mmMerchantCategoryCode
	 * CardPaymentTransaction16.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction20#mmMerchantCategoryCode
	 * CardPaymentTransaction20.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction1#mmMerchantCategoryCode
	 * CardPaymentTransaction1.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction11#mmMerchantCategoryCode
	 * CardPaymentTransaction11.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction19#mmMerchantCategoryCode
	 * CardPaymentTransaction19.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction5#mmMerchantCategoryCode
	 * CardPaymentTransaction5.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction15#mmMerchantCategoryCode
	 * CardPaymentTransaction15.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction3#mmMerchantCategoryCode
	 * CardPaymentTransaction3.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction13#mmMerchantCategoryCode
	 * CardPaymentTransaction13.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction28#mmMerchantCategoryCode
	 * CardPaymentTransaction28.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction22#mmMerchantCategoryCode
	 * CardPaymentTransaction22.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction34#mmMerchantCategoryCode
	 * CardPaymentTransaction34.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction31#mmMerchantCategoryCode
	 * CardPaymentTransaction31.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData3#mmMerchantCategoryCode
	 * CommonData3.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction29#mmMerchantCategoryCode
	 * CardPaymentTransaction29.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction25#mmMerchantCategoryCode
	 * CardPaymentTransaction25.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction30#mmMerchantCategoryCode
	 * CardPaymentTransaction30.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction26#mmMerchantCategoryCode
	 * CardPaymentTransaction26.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction36#mmMerchantCategoryCode
	 * CardPaymentTransaction36.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction44#mmMerchantCategoryCode
	 * CardPaymentTransaction44.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction45#mmMerchantCategoryCode
	 * CardPaymentTransaction45.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction49#mmMerchantCategoryCode
	 * CardPaymentTransaction49.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47#mmMerchantCategoryCode
	 * CardPaymentTransaction47.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction41#mmMerchantCategoryCode
	 * CardPaymentTransaction41.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData4#mmMerchantCategoryCode
	 * CommonData4.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction46#mmMerchantCategoryCode
	 * CardPaymentTransaction46.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction40#mmMerchantCategoryCode
	 * CardPaymentTransaction40.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction5#mmMerchantCategoryCode
	 * CardTransaction5.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmMerchantCategoryCode
	 * CardTransaction15.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction60#mmMerchantCategoryCode
	 * CardPaymentTransaction60.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction61#mmMerchantCategoryCode
	 * CardPaymentTransaction61.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction64#mmMerchantCategoryCode
	 * CardPaymentTransaction64.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction59#mmMerchantCategoryCode
	 * CardPaymentTransaction59.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction56#mmMerchantCategoryCode
	 * CardPaymentTransaction56.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction51#mmMerchantCategoryCode
	 * CardPaymentTransaction51.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData5#mmMerchantCategoryCode
	 * CommonData5.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction55#mmMerchantCategoryCode
	 * CardPaymentTransaction55.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction62#mmMerchantCategoryCode
	 * CardPaymentTransaction62.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction71#mmMerchantCategoryCode
	 * CardPaymentTransaction71.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction75#mmMerchantCategoryCode
	 * CardPaymentTransaction75.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction74#mmMerchantCategoryCode
	 * CardPaymentTransaction74.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction70#mmMerchantCategoryCode
	 * CardPaymentTransaction70.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction72#mmMerchantCategoryCode
	 * CardPaymentTransaction72.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction76#mmMerchantCategoryCode
	 * CardPaymentTransaction76.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonData6#mmMerchantCategoryCode
	 * CommonData6.mmMerchantCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction69#mmMerchantCategoryCode
	 * CardPaymentTransaction69.mmMerchantCategoryCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantCategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMerchantCategoryCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CardPaymentTransactionDetails8.mmMerchantCategoryCode, CommonData1.mmMerchantCategoryCode, CardPaymentTransaction4.mmMerchantCategoryCode, CommonData2.mmMerchantCategoryCode,
					CardPaymentTransaction14.mmMerchantCategoryCode, CardPaymentTransaction7.mmMerchantCategoryCode, CardPaymentTransaction16.mmMerchantCategoryCode, CardPaymentTransaction20.mmMerchantCategoryCode,
					CardPaymentTransaction1.mmMerchantCategoryCode, CardPaymentTransaction11.mmMerchantCategoryCode, CardPaymentTransaction19.mmMerchantCategoryCode, CardPaymentTransaction5.mmMerchantCategoryCode,
					CardPaymentTransaction15.mmMerchantCategoryCode, CardPaymentTransaction3.mmMerchantCategoryCode, CardPaymentTransaction13.mmMerchantCategoryCode, CardPaymentTransaction28.mmMerchantCategoryCode,
					CardPaymentTransaction22.mmMerchantCategoryCode, CardPaymentTransaction34.mmMerchantCategoryCode, CardPaymentTransaction31.mmMerchantCategoryCode, CommonData3.mmMerchantCategoryCode,
					CardPaymentTransaction29.mmMerchantCategoryCode, CardPaymentTransaction25.mmMerchantCategoryCode, CardPaymentTransaction30.mmMerchantCategoryCode, CardPaymentTransaction26.mmMerchantCategoryCode,
					CardPaymentTransaction36.mmMerchantCategoryCode, CardPaymentTransaction44.mmMerchantCategoryCode, CardPaymentTransaction45.mmMerchantCategoryCode, CardPaymentTransaction49.mmMerchantCategoryCode,
					CardPaymentTransaction47.mmMerchantCategoryCode, CardPaymentTransaction41.mmMerchantCategoryCode, CommonData4.mmMerchantCategoryCode, CardPaymentTransaction46.mmMerchantCategoryCode,
					CardPaymentTransaction40.mmMerchantCategoryCode, CardTransaction5.mmMerchantCategoryCode, CardTransaction15.mmMerchantCategoryCode, CardPaymentTransaction60.mmMerchantCategoryCode,
					CardPaymentTransaction61.mmMerchantCategoryCode, CardPaymentTransaction64.mmMerchantCategoryCode, CardPaymentTransaction59.mmMerchantCategoryCode, CardPaymentTransaction56.mmMerchantCategoryCode,
					CardPaymentTransaction51.mmMerchantCategoryCode, CommonData5.mmMerchantCategoryCode, CardPaymentTransaction55.mmMerchantCategoryCode, CardPaymentTransaction62.mmMerchantCategoryCode,
					CardPaymentTransaction71.mmMerchantCategoryCode, CardPaymentTransaction75.mmMerchantCategoryCode, CardPaymentTransaction74.mmMerchantCategoryCode, CardPaymentTransaction70.mmMerchantCategoryCode,
					CardPaymentTransaction72.mmMerchantCategoryCode, CardPaymentTransaction76.mmMerchantCategoryCode, CommonData6.mmMerchantCategoryCode, CardPaymentTransaction69.mmMerchantCategoryCode);
			elementContext_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantCategoryCode";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min3Max4Text.mmObject();
		}
	};
	protected Max35Text merchantIdentification;
	/**
	 * Number that identifies the merchant to the card issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MerchantRole MerchantRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number that identifies the merchant to the card issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMerchantIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MerchantRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantIdentification";
			definition = "Number that identifies the merchant to the card issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MerchantRole";
				definition = "Party performing the card payment transaction.";
				derivationElement_lazy = () -> Arrays.asList(CardPaymentEnvironment13.mmMerchant, CardPaymentEnvironment14.mmMerchant, CardPaymentEnvironment9.mmMerchant, CardPaymentEnvironment12.mmMerchant,
						CardPaymentEnvironment10.mmMerchant, CardPaymentEnvironment18.mmMerchant, CardPaymentEnvironment24.mmMerchant, CardPaymentEnvironment20.mmMerchant, CardPaymentEnvironment27.mmMerchant,
						CardPaymentEnvironment26.mmMerchant, CardPaymentEnvironment23.mmMerchant, CardPaymentEnvironment22.mmMerchant, CardPaymentEnvironment32.mmMerchant, CardPaymentEnvironment36.mmMerchant,
						CardPaymentEnvironment40.mmMerchant, CardPaymentEnvironment34.mmMerchant, CardPaymentEnvironment35.mmMerchant, CardPaymentEnvironment39.mmMerchant, CardPaymentEnvironment52.mmMerchant,
						CardPaymentEnvironment49.mmMerchant, CardPaymentEnvironment51.mmMerchant, CardPaymentEnvironment48.mmMerchant, CardPaymentEnvironment45.mmMerchant, CardPaymentEnvironment54.mmMerchantIdentification,
						CardPaymentEnvironment53.mmMerchant, CardPaymentEnvironment47.mmMerchant, CardPaymentEnvironment61.mmMerchant, CardPaymentEnvironment60.mmMerchant, CardPaymentEnvironment66.mmMerchantIdentification,
						CardPaymentEnvironment62.mmMerchant, CardPaymentEnvironment58.mmMerchant, CardPaymentEnvironment59.mmMerchant, CardPaymentEnvironment57.mmMerchant);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(MerchantRole.mmMerchantCategoryCode, MerchantRole.mmMerchantIdentification);
			}
		});
		return mmObject_lazy.get();
	}

	public Min3Max4Text getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(Min3Max4Text merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Max35Text getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(Max35Text merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}
}